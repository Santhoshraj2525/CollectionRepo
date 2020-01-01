package collection;

import java.util.Iterator;
import java.util.Stack;

public class StackEg {

	public static void main(String[] args) {
		Stack ss = new Stack<Character>();
		ss.push(99);
		ss.push('u');
		ss.push("hey Stacky");
		ss.addElement("love");
		String pe=(String) ss.peek();
		//System.out.println(pe);
		ss.pop();
		Iterator ir = ss.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		

	}

}
