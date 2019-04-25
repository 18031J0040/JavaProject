package serialization2;

import java.io.Serializable;


	public class Studentinfor implements Serializable {
		   /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		  
		  
	public String name;
	public int rollnum;
	public int phonenum;
	public int IT_marks;
	public int SS_marks;
	public String toString() 
	{
		return "Student name"+name+"\n"+"Rolll no :"+rollnum+"\n"+"ph no :"+phonenum+"IT MARKS: "+IT_marks+" SS MARKS: "+SS_marks+"\n\n";
	}
}

