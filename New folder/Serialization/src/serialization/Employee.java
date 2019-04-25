package serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String name;
	   public String address;
	   public int SSN;
	   public int number;
	   
	   public void mailCheck() {
	      System.out.println(name + " " + (String) address +" "+SSN+" "+number);
	   }
	}