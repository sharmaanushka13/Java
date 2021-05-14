package CollectionFramework;

import java.util.ArrayList;

public class ListIterator {

	public static void main(String[] args) {
		
ArrayList<Object> n=new ArrayList<>();
		

n.add("Della");
n.add("Oceania");
n.add("Verdura");
n.add("Altura");
n.add("Olivia");
n.add("Azura");
		
		System.out.println(n);
		
		java.util.ListIterator<Object>  l= n.listIterator(n.size());
		
		while(l.hasPrevious())
		{
			Object s=l.previous();
			System.out.println(s);
			
			
			
			
			
		}
	}

}
