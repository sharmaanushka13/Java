package Lamda;

import java.util.ArrayList;

public class RemoveOddLength {

	

			public static void main(String[] args) {
				
			
			ArrayList<String>n=new ArrayList<String>();
			
			n.add("Della");
			n.add("Oceania");
			n.add("Verdura");
			n.add("Altura");
			n.add("Olivia");
			n.add("Azura");
			
			n.removeIf(t->(t.length()%2==1));
			System.out.println(n);

	}

}
