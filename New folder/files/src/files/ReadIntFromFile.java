package files;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadIntFromFile {
	public static void main(String[] args) 
	 {
		 int i;
	 String strFilePath = "nonpn.txt";
	   try
	    {
	      FileInputStream fin = new FileInputStream(strFilePath);
	     
	      DataInputStream din = new DataInputStream(fin);
	       while((i=din.read())!=-1)
		   {
	         System.out.println(i);
	       }
	         din.close();
	      }
	    catch(FileNotFoundException fe)
	    {
	      System.out.println("FileNotFoundException : " + fe);
	    }
	    catch(IOException ioe)
	    {
	      System.out.println("IOException : " + ioe);
	    }
	  }
}
