package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Conversion {
	public static void main(String args[])
	{  
		   try
		   {  
		     FileOutputStream fout=new FileOutputStream("abc.txt");//for write operation  
		     String s;
		     /*
		      * for entering a string
		      */
		     System.out.println("enter string:");
		     @SuppressWarnings("resource")
			Scanner scan=new Scanner(System.in);
		     s=scan.nextLine();  
		     byte b[]=s.getBytes();//converting string into byte array  
		     fout.write(b);  
		     fout.close();  
		     System.out.println("successfully stored");
		     FileInputStream fin=new FileInputStream("abc.txt");//for read operation  
		     int i=0;
		     System.out.printf("the string is:");
		     while((i=fin.read())!=-1)
		     {  
		    	 System.out.print((char)i);  
		     }
		     
		         
		     
	            
		     fin.close();  
		   
		   }
		  catch(Exception e)
		   {
			  System.out.println(e);
		   } 
	}
}


