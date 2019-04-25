package ProjectMain;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


class LoginDetails1 extends Profile
{
	String ln;
	String ps;
	String ac;
	}
public class Logindetails
	 {
		 public void info() throws ClassNotFoundException, IOException
		 {
		Scanner s=new Scanner(System.in);
		 FileInputStream file = null;
		try {
			file = new FileInputStream("LoginDetails.txt");
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} 
	     ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(file);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	 	
	 	 ArrayList<Profile> a=new ArrayList<Profile>();
	    try {
			a = (ArrayList<Profile>) in.readObject();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    LoginDetails1 ld= new LoginDetails1();
	    System.out.println("enter Email ID :");
	    ld.ln=s.next();
	    System.out.println("enter pasword :");
	    ld.ps=s.next();
	    
		for(int i=0;i<a.size();i++) {
			Profile u=a.get(i);	
			boolean found=false;
			if((u.emailid).equals(ld.ln))
			{
				if (u.activation == false) {
					System.out.println("Your account not activated");
					System.out.println("Please enter your activateion code :");
			    ld.ac=s.next();
			   
			    if((u.code).equals(ld.ac) )
			    {
				    System.out.println("loggedin Successfully");
	                u.activation = true;
	              
	                mychoices(u,i);
			    }
			    else
			    {
				    System.out.println("wrong activation code");

			    }

			}
				else if(u.activation == true)
				{
				    System.out.println("loggedin Successfully");
				    mychoices(u,i);
				}
	        } 
			else
			{
				System.out.print("SORRY.....! account doesnt exist");
			}
		}
	 }

		private void mychoices(Profile u,int i) throws ClassNotFoundException, IOException {
			Scanner s=new Scanner(System.in);
			FileInputStream file = null;
			try {
				file = new FileInputStream("LoginDetails.txt");
			} catch (FileNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} 
		     ObjectInputStream in = null;
			try {
				in = new ObjectInputStream(file);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		 	ArrayList<Profile> a=new ArrayList<Profile>();
		    try {
				a = (ArrayList<Profile>) in.readObject();
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\n1.add money \n2.send money \n3.Request money\n4.main menu");
			int choice=s.nextInt();
			ArrayList<Profile> aaa=new ArrayList<Profile>();
			FileOutputStream foo=new FileOutputStream("LoginDetails.txt");
			ObjectOutputStream oos=new ObjectOutputStream(foo);
			//Account acou=new Account(0);
			DateTimeDispaly mt=new DateTimeDispaly();
			
			while(choice==1 || choice==2 || choice==3|| choice==4)
			{
			switch(choice)
			{
			case 1:Profile uc=new Profile();
			System.out.println("enter amount to be added");
			double add=s.nextDouble();
			u.ma.credit(add);
			uc=u;
			a.set(i,uc);
			mt.date();
			oos.writeObject(a);
			oos.close();
			foo.close();
			break;
			case 2:Profile uc1=new Profile();
			System.out.println("Enter the mail of sender: ");
			String em2=s.next();
			int c=0;Profile uc4=null;int l=0;
			for(int k = 0;k<a.size();k++)
			{
				Profile uc3=a.get(k);
			if((uc3.emailid).equals(em2))
			{
				c++;
				uc4=uc3;
				l=k;
				break;
				
			}
				
			}
			if(c>0)
			{
				System.out.println("enter amount to be sent");
				double sen=s.nextDouble();
				u.ma.debit(sen);uc1=u;a.set(i,uc1);
				uc4.ma.credit(sen);	
			}
			else
			{
				System.out.println("invalid user name ");
			}
			
			mt.date();
			a.set(l,uc4);
			
			oos.writeObject(a);
			oos.close();
			foo.close();
			break;
			case 3:Profile uc2=new Profile();
				System.out.println("enter amount to be requested");
			double req=s.nextDouble();
			uc2=u;
			a.remove(u);
			//u.da=
			mt.date();
			System.out.println("Waiting for the sender to send");
			System.out.println("Enter the mail of sender: ");
			String em21=s.next();
			int c1=0;
			for(int k = 0;k<a.size();k++)
			{
				Profile uc3=a.get(k);
			if((uc3.emailid).equals(em21))
			{
				c1++;
			}
				
			}
			if(c1>0)
			{
				System.out.println("Enter amount : ");
				double dou=s.nextDouble();
				System.out.println(dou+" amount is requested");

			}
			else
			{
				System.out.println("invalid user name ");

			}
			System.out.println("present account balance is :"+u.ma.getBalance());
			a.add(uc2);
			oos.writeObject(a);
			oos.close();
			foo.close();
			break;
			case 4:MainMenu m=new MainMenu();
			m.show();
			}
			System.out.println("\n1.add money \n2.send money \n3.Request money\n4.main menu");
			choice=s.nextInt();
			}
		}
			
		}