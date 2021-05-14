package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Order {

	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
        h.add("Rohan");
        h.add("is");
        h.add("not");
        h.add("Shouting");
        
        System.out.println("hash set  "+h);
        
        LinkedHashSet<String> l=new LinkedHashSet<String>();
        l.add("Rohan");
        l.add("is");
        l.add("not");
        l.add("Shouting");
        
        System.out.println("Linkedhash set "+l);        

	}

}
