package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demostration {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
   boolean f=new File("library").mkdir();
   File ff=new File("library/hello.txt");
   ff.createNewFile();
   Employee e = new Employee();
   e.name = "Divya";
   e.address = "MSIT, Hyderabad";
   e.SSN = 1803140;
   e.number = 40;
   try {
       FileOutputStream fileOut =new FileOutputStream("hello.txt");
       ObjectOutputStream out = new ObjectOutputStream(fileOut);
       out.writeObject(e);
       out.close();
       fileOut.close();
       System.out.println("Serialized data is saved in hello.txt");
    } catch (IOException i) {
       i.printStackTrace();
    }
   ObjectInputStream in =new ObjectInputStream(new FileInputStream("hello.txt"));
	Employee e1 =(Employee)in.readObject();
	System.out.println(e1.name+" "+e1.address+" "+e1.SSN+" "+e1.number);
	in.close();
	}
}
