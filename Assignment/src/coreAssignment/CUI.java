package coreAssignment;

import java.util.Scanner;

public class CUI {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int count;
        for(count=0;count<=2;count++)
        {
            System.out.println("enter username");
            String str=sc.nextLine();
            System.out.println("enter password");
            String str1=sc.nextLine();
            if(str.equals("Anushka")&& str1.equals("Simple"))
            {
            System.out.println("welcome"+" "+str);   
            }
            else
            {
            	System.out.println("contact admin");
        }       
            
    }
        
}


	}


