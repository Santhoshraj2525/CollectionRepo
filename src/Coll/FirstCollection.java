package Coll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FirstCollection {

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();
		c.add(1);
		c.add(2);
		/*c.add("Strings");
		c.add(0.02f);*/
		
		c.remove("Strings");
		
		/*for(Object o : c) {
			System.out.println(o);
		}*/
		Iterator i = c.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	
	}

}
