package serialization2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializationDemo {
	public static void main(String[] args) throws IOException {
		 
		   @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		   System.out.println("No of students:");
		   int n=s.nextInt();
		   Studentinfor []stud=new Studentinfor[n];
		   for(int i = 0;i<n;i++)
			   
		   {
			   Studentinfor sd=new Studentinfor();
			   System.out.println("Student name: ");
				   sd.name=s.next();
				System.out.println("Student Roll no:");
				sd.rollnum=s.nextInt();
				System.out.println("Student ph no:");
				sd.phonenum=s.nextInt();
				System.out.println("Student It marks:");
				sd.IT_marks=s.nextInt();
				System.out.println("Student SS marks:");
				sd.SS_marks=s.nextInt();

		        stud[i]=sd;
		   
		   }
		    
		   try {
		       FileOutputStream fileOut =new FileOutputStream("students.txt");
		       ObjectOutputStream out = new ObjectOutputStream(fileOut);
		       out.writeObject(stud);
		       fileOut.close();
		       System.out.printf("Serialized data is saved in students.txt");
		    } catch (IOException i) {
		       i.printStackTrace();
		    }
			
			}

}
