package Lamda;

import java.util.Scanner;

public class Arithmatic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First number");
		int a = sc.nextInt();
		System.out.println("Second number");
		int b = sc.nextInt();

		Calculate add = (c, d) -> c + d;
        System.out.println("addition=" + add.operation(a, b));
        
        Calculate sub = (c, d) -> c - d;
		System.out.println("subsraction=" + sub.operation(a, b));

		Calculate mul = (c, d) -> c * d;
		System.out.println("multiplication=" + mul.operation(a, b));

		Calculate div = (c, d) -> c / d;
		System.out.println("division=" + div.operation(a, b));

		
		

	}

}

interface Calculate{
	float operation(int a, int b);



	}


