package coreAssignment;

import java.util.Scanner;

/*import javax.annotation.processing.SupportedAnnotationTypes;*/

public class IncomeTax {

	public static void main(String[] args) {
		/*@SupportedAnnotationTypes("resource")*/
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the income range");
		double income=s.nextDouble();
		
		
		if(income>=0 && income<=180000)
		{
			
			System.out.println("The tax pay in percentage is Nil");
			
			
		}
		else if (income>=180001 && income<=300000 )
		{
			
			
			System.out.println("The tax pay in percentage is 10%");	
			
		}
		else if(income>=300001 && income<=500000)
		{
			
			
			System.out.println("The tax pay in percentage is 20%");	
			
		}
		else if(income>=500001 && income<=1000000)
		{
			
			System.out.println("The tax pay in percentage is 30%");	
		}
		
		

	}


	}

