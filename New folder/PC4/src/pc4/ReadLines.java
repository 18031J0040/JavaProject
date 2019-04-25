package pc4;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadLines {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws IOException, ClassNotFoundException 
	{

		FileInputStream fis=new FileInputStream("book.txt");
		@SuppressWarnings("resource")
		DataInputStream dis=new DataInputStream(fis);
		String i=null;int j=0;
		String s[]=new String[15];
		while((i=dis.readLine())!=null)
		{
			s[j]=i;
		j++;
		}
		int c=0;
		for(j=0;j<s.length;j++)
		{
			if(s[j]==null)
			{
				c=j;
				break;
			}
			
		}
		for(j=0;j<c;j++)
		{
			if(j==0 ||j==1 || j==3|| j==c-2 || j==c-1 ||j==c-3)
			{
				System.out.println(s[j]);

			}
			
		}
		
	}
}
