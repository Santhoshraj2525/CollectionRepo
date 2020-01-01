package Coll;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterfaceDemo {

	public static void main(String[] args) {
		Map<String,String> ma = new HashMap();
		ma.put("Name", "Santhohsraj");
		ma.put("Designattion", "SE");
		ma.put("Role", "Testing");
		
		Set<String> keys = ma.keySet();
		
		for(String key : keys) {
		System.out.println(key+ " : " +ma.get(key)); 
		}
	}

}
