package collection;

import java.util.Iterator;
import java.util.Vector;



public class VectorIterator {
public static void main(String args[])
{
	Vector<String>vct=new Vector<String>();
	vct.add("first");
	vct.add("second");
	vct.add("third");
	vct.add("random");
	Iterator<String> itr=vct.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
