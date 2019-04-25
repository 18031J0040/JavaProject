package serialization;

import java.io.Serializable;


	public class Books implements Serializable {
		   /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public String name;
		   
		   
		   public void bookName() {
		      System.out.println(name);
		   }
}
