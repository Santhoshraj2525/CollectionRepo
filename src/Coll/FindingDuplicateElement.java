package Coll;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindingDuplicateElement {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		ArrayList<String> AL = new ArrayList<>();
		AL.add("Sandy");
		AL.add("Santhoshraj");
		AL.add("Santhohs");
		AL.add("Raj");
		AL.add("Sandy");
		
		Set<String> st = new HashSet<>();
		
		
		for (String s:AL) {
			if(st.add(s)==false)
			System.out.println(s);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
