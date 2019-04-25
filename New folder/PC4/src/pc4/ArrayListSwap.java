package pc4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSwap {


	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		Swap s[]=new Swap[2];
	ArrayList<Swap> a =new ArrayList<Swap>() ;
	for(int i = 0;i<2;i++)
	{
		Swap s1=new Swap();
		System.out.println("enter element to be swapped:");
		s1.s=sc.next();
		s[i]=s1;
		a.add(s[i]);
	}
	
	System.out.println("before Swapping");
	for(int i = 0;i<2;i++)
	{
		System.out.println((i+1)+" element is: "+a.get(i));
	}
	ArrayList<Swap> b=new ArrayList<Swap>() ;
	b.add(a.get(1));
	b.add(a.get(0));
	a=b;
	System.out.println("after Swapping");

	for(int i = 0;i<2;i++)
	{
		System.out.println((i+1)+" element is: "+a.get(i));
	}
}
}
