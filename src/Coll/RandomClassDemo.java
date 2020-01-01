package Coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class RandomClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> T = new ArrayList<>();
		Random R = new Random();
		
		for(int i=1;i<=100;i++) {
			T.add(R.nextInt(1000));
		}
		Comparator cr = new Com();
		Collections.sort(T, cr);
		
		for(int j:T) {
			System.out.println(j);
		}
	}

}
class Com implements Comparator<Integer>{

	
	public int compare(Integer o1, Integer o2) {
		/*int diff=0;
		if(o1%10>o2%10)
			diff= 1;
		else if (o1%10<o2%10)
			diff= -1;*/
		
		return o1%10>o2%10?1:o1%10<o2%10?-1:0;
	}
	
}
