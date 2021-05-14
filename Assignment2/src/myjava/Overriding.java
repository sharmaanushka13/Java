package myjava;
class Employee {
    int salary;

public void method()
{
   System.out.println("salary is" +salary);
   
}
}
class Manager extends Employee
{
   int incentive;
   public void method()
   {
       System.out.println("incentive is" +incentive);
   }
}
class Labour extends Employee
{
   int overtime;
   public void method()
   {
       System.out.println("overtime is" +overtime);
   
   }
}

public class Overriding {

	public static void main(String[] args) {
		 Labour labour=new Labour();
	        labour.overtime=5000;
	        labour.method();
	        Manager manager=new Manager();
	        manager.incentive=8000;
	        manager.method();
	        System.out.println("total salary is" +(labour.overtime+manager.incentive)) ;
	    }

	}


