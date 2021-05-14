package myjava;

public class Singleton {
	private static Singleton s1 = null;
	 
    public String s;
  
   
    private Singleton()
    {
        s = "Singleton class";
    }
  
 
    public static Singleton getInstance()
    {
        if (s1 == null)
            s1 = new Singleton();
  
        return s1;
    }
}
  class main
  {

	public static void main(String[] args) {
		Singleton x = Singleton.getInstance();
		  
	      
        Singleton y = Singleton.getInstance();
  
     
        Singleton z = Singleton.getInstance();
  
        
        x.s = (x.s).toUpperCase();
  
        System.out.println(" x is " + x.s);
        System.out.println(" y is " + y.s);
        System.out.println(" z is " + z.s);
        System.out.println("\n");
  
        // changing variable of instance z
        z.s = (z.s).toLowerCase();
  
        System.out.println(" x is " + x.s);
        System.out.println(" y is " + y.s);
        System.out.println("z is " + z.s);
		
	}

}
