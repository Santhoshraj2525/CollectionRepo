package Coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCo {

	public static void main(String[] args) {
		List<Students> ls = new ArrayList<>();
		ls.add(new Students(6,35));
		ls.add(new Students(9,35));
		ls.add(new Students(5,85));
		ls.add(new Students(1,46));
		ls.add(new Students(3,77));
		
		/*Collections.sort(ls, (s1,s2)->
		{
			return s1.rollNo>s2.rollNo?1:s1.rollNo<s2.rollNo?-1:0;			
		});   // this is using comparator class*/
		
		Collections.sort(ls);
		
		for (Students s : ls) {
			System.out.println(s);
		}
		
	
	}
}
class Students implements Comparable<Students>{
	int rollNo;
	int marks;
	public Students(int rollNo, int marks) {
		this.rollNo=rollNo;
		this.marks=marks;
	}
	
	public String toString() {
		return "{Student Roll No is : " +rollNo+ " and the mark is : " +marks+ "}";
	}

	@Override
	public int compareTo(Students o) {
		return this.marks>o.marks?-1:this.marks<o.marks?1:0;
	}
}
