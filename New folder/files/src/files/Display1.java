import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Display1 
{
	 public static void main(String[] args)
	  {
		 int wordCount = 1;
	   try
		   {  
		     FileOutputStream fout=new FileOutputStream("abc.txt");
		     String s;
		     /*
		      * for entering a string
		      */
		     System.out.println("enter string:");
			Scanner sc=new Scanner(System.in);
		     s=sc.nextLine();
		     byte b[]=s.getBytes();   
		     fout.write(b);  
		     fout.close();
		     System.out.println("successfully stored");
		     /*
		      * for reading a string
		      */
		     FileInputStream fin=new FileInputStream("abc.txt");//for read operation  
		     int i=0; 
				System.out.printf("the string is:");
				while((i=fin.read())!=-1)
				{  
					if((char)i==' ')
					{ 
						/*
						 * for counting the words
						 */
						wordCount++;
					}
					
					System.out.print((char)i);
				}
				System.out.printf("%n");
				System.out.println("Word count is = " + wordCount);
				fin.close();
				/*
				 * for splitting the words
				 */
		     
		    // ArrayList<String> list=new ArrayList<String>();
			    String str[]=s.split(" ");
				System.out.println("UNIQUE WORDS");
			    for(int j=0;j<str.length;j++)
			    {
					 int c=0;
					for (i=0;i<str.length ;i++ )
					{
						 if(str[j].equals(str[i]))
						{
							c=c+1;
						}
					}
					if(c==1)
					{
						System.out.println(str[j]);
			     
			      
			    }
		    }
		   }
		   catch(Exception e)
				{
			   System.out.println(e);
			   }  
}
}
	      
     




