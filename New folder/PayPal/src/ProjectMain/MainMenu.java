/*
 * 
 */
package ProjectMain;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author pg
 *
 */
public class MainMenu {
	
	public static void show() throws IOException, ClassNotFoundException{
		//show the welcome message with the main menu options
		System.out.println("-------***** WELCOME TO PAYPAL *****-------");
		//take the menu option as input from the console
		
		
		while(true)
		{
			System.out.println("\n1.SIGN UP \n2.LOGIN \n3.ACTIVATION CODE\n4.EXIT");
			System.out.println("enter your choice");
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
		switch(n)
		{
		case 1:System.out.println("sign up ");
		Signup s=new Signup();
		s.details();
		break;
		case 2:System.out.println("login");
		Logindetails l=new Logindetails();
		l.info();
		break;
		case 3:Signup s11=new Signup();
		s11.display();
		break;
		case 4:System.out.println("exit");
		System.exit(0);
		break;
		
		}
		/*System.out.println("\n1.SIGN UP \n2.LOGIN \n3.EXIT");
		System.out.println("enter your choice");
		 n=sc.nextInt();*/
		}
	}
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{ 	
	MainMenu m=new MainMenu();
	m.show();
	}
}
		//take email address as input from the console
		
		//based on the given menu option instantiate the respective screens
	


