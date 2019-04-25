package collection;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTableRemove {
    public static void main(String[] args)
    {
 
        // Creating an empty Hashtable
        Hashtable<Integer, String> h = new Hashtable<Integer, String>();
 
        // Inserting elements into the table
        h.put(10, "divya");
        h.put(11, "doly");
        h.put(12, "manu");
        h.put(13, "murthy");
        h.put(14, "rajesh");
 
        // Displaying the Hashtable
        System.out.println("Initial Table is: " + h);
        System.out.println("enter number to be removed:");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        h.remove(m);
        // Displaying the new table
        System.out.println("New table is: " + h);
    }
}
