package com.paypal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Profile implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -614126379535189042L;

	/**
	 * 
	 */

	Profile() {
	}

	String name;
	String email;
	String password;
	boolean activation;
	String activecode;
	private float accountBal;
	private ArrayList<Transaction> transactions;

	public Profile(String name, String email, String password, boolean activation, String activecode) {

		this.name = name;
		this.email = email;
		this.password = password;
		this.activation = activation;
		this.activecode = activecode;
		accountBal = 0;
	}

	@Override
	public String toString() {
		return "Profile [name=" + name + ", email=" + email + ", password=" + password + ", activation=" + activation
				+ ", activecode=" + activecode + "]";
	}

	@SuppressWarnings("unchecked")
	public void login(String eml, String passwrd) {
		FileInputStream file;
		ObjectInputStream in;
		ArrayList<Profile> al = null;
		try {
			file = new FileInputStream("file.ser");
			in = new ObjectInputStream(file);
			al = (ArrayList<Profile>) in.readObject();
			in.close();
			file.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < al.size(); i++) {
			@SuppressWarnings("unused")
			boolean found=false;
			if (al.get(i).email.equals(eml)) {

				if (al.get(i).activation == false) {
					@SuppressWarnings("unused")
					Profile f = al.get(i);
					System.out.println("Your account not activated");
					System.out.println("Please enter your activation code " + al.get(i).activecode);
					@SuppressWarnings("resource")
					Scanner sc = new Scanner(System.in);
					String code = sc.next();
					al.get(i).activation = true;
					al.get(i).activecode = code;
					al.get(i).accountBal=(float) 0.0;
					// al.add(i,f);// updating user profile after activation
					String filename = "file.ser";
					FileOutputStream file1;
					try {
						file1 = new FileOutputStream(filename);
						@SuppressWarnings("resource")
						ObjectOutputStream out = new ObjectOutputStream(file1);
						out.writeObject(al);
						makeTransaction(eml);
						break;
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println("not able activate" + e.getMessage());
					}
				}
				else if(al.get(i).activation == true) {
					makeTransaction(eml);
				}
				break;
			} else {
				// System.out.println("Your account summary here");
				
			}

		}
	}
@SuppressWarnings("unchecked")
public void makeTransaction(String eml) {
	System.out.println("inside transaction");
	 FileInputStream file;
	   ObjectInputStream in;
	   ArrayList<Profile>  al = null;
	try {
		file = new FileInputStream("file.ser");
		 in = new ObjectInputStream(file); 
		 al=(ArrayList<Profile>) in.readObject(); 
		   in.close(); 
         file.close(); 
           
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 

     for(int i=0;i<al.size();i++) {
    	   	
  	  
  	   if(al.get(i).email.equals(eml)) 
  	   {
  		 System.out.println("===============================");
  		 System.out.println("= Account Holder details ");
  		 System.out.println("= Email "+al.get(i).email);
  		 System.out.println("= Name "+al.get(i).name);
  		 System.out.println("= Account Balnce "+al.get(i).accountBal);
  		 System.out.println("= Transactions "+ al.get(i).transactions);
  		 System.out.println("===============================");
  		break;
  	   }
  	   
     }

}
}
