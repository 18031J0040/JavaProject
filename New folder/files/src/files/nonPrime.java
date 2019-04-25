package files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class nonPrime {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
try{
FileOutputStream fout =new FileOutputStream("nonpn.txt");//fileoutput object
PrintStream ps=new PrintStream(fout);//printstream object
    	int i,c,j;
   for( i=1;i<=500;i++)
   {
       c=0;
       for(j=1;j<=i;j++)
       {
          if(i%j==0)
           {
           c++;        	
           }
	   }
       if(c!=2)
       {
    	   ps.write(i);
    
    	 System.out.println(i);
       }
       	   
    }
  ps.close();
}
catch(IOException e)
{
	System.out.println(e);
}
}
}
