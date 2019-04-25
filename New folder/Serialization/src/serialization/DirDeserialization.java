package serialization;

import java.io.*;
import java.util.ArrayList;
public class DirDeserialization 
{
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String [] args)
    {
        ArrayList<String> arraylist= new ArrayList<String>();
        try
        {
            FileInputStream fis = new FileInputStream("book.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            arraylist = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
         }catch(IOException ioe){
             ioe.printStackTrace();
             return;
          }catch(ClassNotFoundException c){
             System.out.println("Class not found");
             c.printStackTrace();
             return;
          }
        for(String tmp: arraylist){
            System.out.println(tmp);
        }
   }
}
