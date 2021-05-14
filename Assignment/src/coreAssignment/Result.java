package coreAssignment;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three subjects marks");
         a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();
         if (a>60 && b>60 && c>60)
         {
             System.out.println("passed");
         }
         else if ((a>60&&b>60)||(b>60&&c>60)||(c>60&&a>60))
        {
            System.out.println("promoted");
        }
         else if ((a>60&&(b<60||c<60))||(b>60&&(c<60||a<60)) ||(c>60&&(b<60||a<60)))
         {
             System.out.println("failed");
         }
}
}


