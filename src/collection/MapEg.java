package collection;

import java.util.HashMap;
import java.util.Map;



public class MapEg {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(05, "Sonia");
		map.put(02, "Santhoshraj");
		map.put(04, "Chris");
		map.put(01, "Kuzhazhi");
		/*for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+ " "+m.getValue());
		}*/
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

	}

}
