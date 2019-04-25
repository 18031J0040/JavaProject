package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumeration {
public static void main(String args[])
{
	Vector<String>v=new Vector<String>();
	v.add("divya");
	v.add("manogna");
	v.add("dolly");
	Enumeration<String> e=v.elements();
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
}
}
