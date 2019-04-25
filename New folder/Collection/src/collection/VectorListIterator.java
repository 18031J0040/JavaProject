package collection;

import java.util.ListIterator;
import java.util.Vector;

public class VectorListIterator {
	public static void main(String args[])
	{
		Vector<String>vct=new Vector<String>();
		vct.add("first");
		vct.add("second");
		vct.add("third");
		vct.add("random");
		ListIterator<String> litr=vct.listIterator();
		System.out.println("in forward direction");
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("in reverse direction");
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
	}
}
