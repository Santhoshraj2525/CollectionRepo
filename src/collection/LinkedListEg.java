package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEg {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList<>();
		ll.add('k');
		ll.add(8);
		ll.add("Stringsof");
		ll.addFirst("Thisis mixed datatype");
		Iterator it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
