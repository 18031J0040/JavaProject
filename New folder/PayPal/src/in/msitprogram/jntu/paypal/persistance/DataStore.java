package in.msitprogram.jntu.paypal.persistance;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import in.msitprogram.jntu.paypal.accounts.PPAccount;

public class DataStore
{
	
	@SuppressWarnings("null")
	public static PPAccount lookupAccount(String email) throws IOException, ClassNotFoundException 
	{
		PPAccount account = null; //initialize it after reading from file
		// write code to open the files, read
		FileInputStream fin=new FileInputStream("LoginDetails.txt");
		@SuppressWarnings({ "resource", "unused" })
		ObjectInputStream oi=new ObjectInputStream(fin);
		
		if(account.getEmail().equals(email))
			{
				return account;
			}
		
		return null;
	}
	public static void writeAccount(PPAccount account)
	{
		
	}
	
}