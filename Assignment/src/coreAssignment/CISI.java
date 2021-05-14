package coreAssignment;

import java.util.Scanner;

public class CISI {

	public static void main(String[] args) {
		double p,sim,t,r,com;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount:");
        p=sc.nextDouble();
        System.out.println("Enter the no of year");
        t=sc.nextDouble();
        System.out.println("Enter the rate of interest");
        r=sc.nextDouble();
        sim=(p*t*r)/100;
        com=p*(Math.pow((1+r/100),t));
        System.out.println("Simple Interest =" +sim);
        System.out.println("compound Iterest=" +com);
        

 

    

	}

}
