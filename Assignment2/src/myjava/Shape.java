package myjava;
abstract class base{
    public base() {
        System.out.println("make shape");    }
    abstract public void draw();
}
class line extends base{
    public void draw() {
        System.out.println("line");
    }
}
class rectangle extends base{
    public void draw() {
        System.out.println("rectangle");
    }
}
 class cube extends base{
    public void draw() {
        System.out.println("cube");
    }
}
public class Shape {
		    public static void main(String[] args) {       
		    	 line l1=new line();
		         l1.draw();
		         rectangle r1=new rectangle();
		         r1.draw();
		         cube c1=new cube();
		         c1.draw();
		         

	}

}
