package pc4;

import java.util.Iterator;
import java.util.LinkedList;

public class JoinLinkedList {
	public static void main(String args[]){  
	    
	LinkedList<Integer> l1=new LinkedList<Integer>(); 
    LinkedList<Integer> l2=new LinkedList<Integer>(); 
    l1.add(100);  
    l1.add(200);
    l2.add(300);
    l2.add(400);
    
    Iterator<Integer> it1=l1.iterator();  
    while(it1.hasNext())
    {  
     System.out.println(it1.next());  
    }
    
    Iterator<Integer> it2=l2.iterator();
    while(it2.hasNext())
    {  
     System.out.println(it2.next());  
    }
    LinkedList<Integer> l3=new LinkedList<Integer>(); 
    l3.addAll(l1);
    l3.addAll(l2);
    System.out.println(l3);
}
}
