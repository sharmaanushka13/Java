package coreAssignment;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int[] array;int i;   
        array= new int[] {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number");
       int a=sc.nextInt();
       for(i=0;i<=14;i++)
           if(array[i]==a) {
               System.out.println("array contains the given value");
           }
        
        
	}

}
