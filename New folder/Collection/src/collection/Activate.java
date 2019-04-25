package collection;

import java.util.Random;

public class Activate {
		private static final Random random = new Random();
		private static final String CHARS = "abcdefghijkmnopqrstuvwxyzABCDEFGHJKLMNOPQRSTUVWXYZ234567890!@#$";

		public static void main(String [] args) {
			int length=10;
		    StringBuilder token = new StringBuilder(length);
		    for (int i = 0; i < length; i++) {
		        token.append(CHARS.charAt(random.nextInt(CHARS.length())));
		    }
		    System.out.println(token.toString());
		}
	}


