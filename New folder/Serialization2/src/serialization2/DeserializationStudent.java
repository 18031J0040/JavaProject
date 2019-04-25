package serialization2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationStudent {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis =new FileInputStream("students.txt");
	    ObjectInputStream ob=new ObjectInputStream(fis);
	    Studentinfor []sds=(Studentinfor[]) ob.readObject();
	for(int i = 0;i<sds.length;i++)
	{
		System.out.println(sds[i]);
	}
		fis.close();
	}
}
