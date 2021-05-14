import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Fruits {

	public static void main(String[] args) {
		 symbol s=new symbol("pomogranate",120,100,"Red");
	        symbol s1=new symbol("Orange",100,60,"Yellow");
	        symbol s2=new symbol("pineapple",90,130,"Green");
	        List<symbol>l=new ArrayList<>();
	        l.add(s);
	        l.add(s1);
	        l.add(s2);
	    System.out.println(l.stream()
	                           .filter(i->i.calories<100)
	                            .collect(Collectors.toList()));
//	                            l.stream()
//	                           .sorted((i,j)->i.color.compareTo(j.color))
//	                           .forEach(System.out::println);
//	                      l.stream()
//	                       .filter(i->i.color=="Red")
//	                        .collect(Collectors.toList())
//	                         .forEach(System.out::println);
	    
	    }
	    
	    }

	 

	 

	class symbol
	{
	    String name;
	    int calories;
	    int price;
	    String color;
	    public symbol(String name,int calories,int price,String color) {
	        this.name= name;
	        this.calories=calories;
	        this. price=price;
	        this.color= color;
	    }
	    public String toString(){
	        return "name:"+name+ " "+"cal:" +calories+  " "+ "pr:" +price+ " "+ "clr:" +color;
	    }
	        
	    

	}


