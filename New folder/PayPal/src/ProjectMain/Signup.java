package ProjectMain;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.paypal.Activate;


public class Signup implements Serializable 
{
	public void details() throws IOException, ClassNotFoundException
	{
		  ArrayList<Profile> a=new ArrayList<Profile>();
	        FileOutputStream file1 = null;
	        ObjectOutputStream out = null;
	        //Account a12=null;
	        Scanner s=new Scanner(System.in);
	        Profile p=new Profile();
	      try
	      {
	   file1 = new FileOutputStream("LoginDetails.txt"); 
        out = new ObjectOutputStream(file1);   
	    	  FileInputStream file = new FileInputStream("LoginDetails.txt"); 
	          ObjectInputStream in = new ObjectInputStream(file);
	      	
	       a = (ArrayList<Profile>) in.readObject();
	        //file1 = new FileOutputStream("LoginDetails.txt"); 
	       //out = new ObjectOutputStream(file1); 
	      	
	   	   System.out.println("Enter your E-Mail Id: ");
          p.emailid=s.next();int c=0;
          for(int k = 0;k<a.size();k++)
          {	   	   
        	  Profile user=a.get(k);
         
if((user.emailid).equals(p.emailid))
		{
			c++;	
			break;
		}
          }
          if(c>0)
          {
	System.out.println("Already existing");
	c=0;
		}
else
{
  		System.out.println("Enter password:");
  		p.password=s.next();
  		System.out.println("Enter your name:");
  		p.name=s.next();
  		System.out.println("Enter phone number:");
  		p.phonenum=s.next();
  		System.out.println("Enter Address:");
  		p.address=s.next();
  		System.out.println("Choose type of account:");
  		System.out.println("1.personal\n2.Student\n3.Business\n");
  		int n=s.nextInt();
  		switch(n)
  		{
  		case 1:p.Type="Personal Account";
  			   System.out.println("enter adhar card details :");
  			   p.det=s.next();
  			   System.out.println("enter Initial balance of the user :");
  			   double bb=s.nextDouble();
  			   Personal per= new Personal(bb);
  			   p.setaccount(per);
  		       break;
  		case 2:p.Type="Student Account";
  			   System.out.println("enter adhar card details :");
  			   p.det=s.next();
  			   System.out.println("enter Initial balance of the user :");
  			   double bb1=s.nextDouble();
  			   System.out.println("enter EmailID of parent :");   
  			   String str1=s.next();
  			   Profile uc5 = null;
  			   int c1=0; 
		for(int k = 0;k<a.size();k++)
		{
			Profile uc3=a.get(k);
		if((uc3.emailid).equals(str1))
		{
			c1++;
			uc5=uc3;
			break;
			
		}
			
		}
		if(c1>0)
		{
  		Student stud=new Student(bb1,uc5);
		}
		else
		{
			System.out.println("Invalid user");
		}
  		    break;  
  		      
  		case 3:p.Type="Business Account";
  		System.out.println("enter pan card details :");
  		p.det=s.next();
  		System.out.println("enter Initial balance of the user :");
        double bb2=s.nextDouble();
  		//Business be=new Business(bb2);
  		//ud1.setaccount(be);
  		break;
  		}
//  		System.out.println("Activation code:");
  		p.code=RandomString();
         	a.add(p);
         	out.writeObject(a);
  
         	in.close(); 
         	file.close();         
    
         	out.close(); 
         	file.close(); 
}
	      }

	      catch(EOFException ex) 
	      { 
	        System.out.println("Enter your E-Mail Id: ");
	        p.emailid=s.next();
	        System.out.println("Enter password:");
	   		p.password=s.next();
	   		System.out.println("Enter name:");
	   		p.name=s.next();
	   		System.out.println("Enter phonenum:");
	   		p.phonenum=s.next();
	   		System.out.println("Enter Address:");
	   		p.address=s.next();
	   		System.out.println("Choose type of account:");
	   		System.out.println("1.personal\n2.Student\n3.Business\n");
	   		int n=s.nextInt();
	  		switch(n)
	  		{
	  		case 1:p.Type="Personal Account";
	  		System.out.println("enter adhar card details :");
	  		p.det=s.next();
	  		System.out.println("enter Initial balance of the user :");
	         double bb=s.nextDouble();
	  		Personal per= new Personal(bb);
	  		p.setaccount(per);
	  		      break;
	  		case 2:p.Type="Student Account";
	  		System.out.println("enter adhar card details :");
	  		p.det=s.next();
	  		System.out.println("enter Initial balance of the user :");
	        double bb1=s.nextDouble();
	  		System.out.println("enter EmailID of parent :");   
	  		String str1=s.next();
	  		Profile uc5 = null;
	  		int c1=0;
			for(int k = 0;k<a.size();k++)
			{
				Profile uc3=a.get(k);
			if((uc3.emailid).equals(str1))
			{
				c1++;
				uc5=uc3;
				break;
				
			}
				
			}
			if(c1>0)
			{
	  		Student stud=new Student(bb1,uc5);
			}
			else
			{
				System.out.println("Invalid user");
			}
	  		    break;  
	  		      
	  		case 3:p.Type="Business Account";
	  		System.out.println("enter pan card details :");
	  		p.det=s.next();
	  		System.out.println("enter Initial balance of the user :");
	        double bb2=s.nextDouble();
	  		//Business be=new Business(bb2);
	  		//ud1.setaccount(be);
	  		break;
	  		}
	  		p.code=RandomString();
	  		a.add(p);
	     	out.writeObject(a);  	
	     	out.close(); 
	        file1.close(); 

	          System.out.println("No user found"); 
	      } 
	      
	      
					      
	}
	public void display() throws ClassNotFoundException, IOException {
		  FileInputStream file = new FileInputStream("LoginDetails.txt"); 
          ObjectInputStream in = new ObjectInputStream(file);
      	System.out.println("d");
      	 ArrayList<Profile> a=new ArrayList<Profile>();
         a = (ArrayList<Profile>) in.readObject();
		for(int i=0;i<a.size();i++) {
	      	   System.out.println(a.get(i));
	         }      
	}
	public String RandomString() {
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 5;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();
	 
	    return(generatedString);
	}
}