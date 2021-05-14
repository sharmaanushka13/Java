package Lamda;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIntoString {

	public static void main(String[] args) {
		HashMap<String,String> m=new HashMap<>();
		StringBuilder sb=new StringBuilder();
		
		 m.put("Della", "603");
		 m.put("Oceania", "902");
		
		 
		 Set s =m.entrySet();
		 System.out.println(s);
		 
         Iterator n=s.iterator();
         while(n.hasNext())
         {
        	 Map.Entry me =(Map.Entry)n.next();
             String str=(String) me.getKey()+me.getValue()+" ";
        	 sb.append(str);

         }
         
         System.out.println(sb);
	}

	}


