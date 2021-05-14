package Lamda;

import java.util.ArrayList;

public class ReplaceAll {

	public static void main(String[] args) {
		ArrayList<String> n = new ArrayList<>();

		n.add("Della");
		n.add("Oceania");
		n.add("Verdura");
		n.add("Altura");
		n.add("Olivia");
		n.add("Azura");
		
		n.replaceAll(t -> t.toUpperCase());

		System.out.println(n);

	}

}
