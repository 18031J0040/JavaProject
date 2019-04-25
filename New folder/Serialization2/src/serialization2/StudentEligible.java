package serialization2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentEligible {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis =new FileInputStream("students.txt");
	    ObjectInputStream ob=new ObjectInputStream(fis);
	    Studentinfor []sds=(Studentinfor[]) ob.readObject();
	for(int i = 0;i<sds.length;i++)
	{if(sds[i].IT_marks>=80.0)
	{
		System.out.println(sds[i]);
	}
	else
	{
		System.out.println("student "+(i+1)+" is not elligible"); 
	}
	}
		fis.close();

	}
}
