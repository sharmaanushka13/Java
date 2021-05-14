package Lamda;

import java.util.Arrays;

public class FirstLetter {

	public static void main(String[] args) {
StringBuilder sb=new StringBuilder();
		
		Arrays.asList("Artificial","Intelligence")
		.forEach(n->sb.append(n.charAt(0)));
		
		System.out.println(sb);
		
	}

}
