package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorEg {

	public static void main(String[] args) {
		Vector vv=new Vector<String>();
		vv.add("Hi");
		vv.add(99);
		vv.add('j');
		vv.add("hello");
		String str=(String) vv.firstElement();
		System.out.println(str);
		Iterator it = vv.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
