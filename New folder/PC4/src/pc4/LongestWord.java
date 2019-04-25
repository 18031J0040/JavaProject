package pc4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWord {
	public static void main(String [ ] args) throws FileNotFoundException {
       
   }

public String findLongestWords() throws FileNotFoundException {

 String longest_word = " ";
 String current;
 @SuppressWarnings("resource")
Scanner sc = new Scanner(new File("book.txt"));


 while (sc.hasNext()) {
    current = sc.next();
     if (current.length() > longest_word.length()) {
       longest_word = current;
     }

 }
   System.out.println("\n"+longest_word+"\n");
      return longest_word;
      }
}
