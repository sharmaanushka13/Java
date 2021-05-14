package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;



public class Fail {

	public static void main(String[] args) {
HashSet<Object> n=new HashSet();
		
		n.add("Tom");
		n.add("Oggy");
		n.add(25);
		n.add(55);

		Iterator i=n.iterator();
		 while(i.hasNext())
		   {
			   
			   Object a=i.next();
			   n.add("Tom");
			   System.out.println(a);
			   
			   
			   
		   }
			   
			   
			   
		   }

	}


