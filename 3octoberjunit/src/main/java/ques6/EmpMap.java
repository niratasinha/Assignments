package ques6;

import java.util.HashMap;
import java.util.Map;

public class EmpMap {
public static String show() {
	Map<Integer,String>hm = new HashMap<Integer,String>();
	hm.put(1, "Amit");
	hm.put(2, "Badal");
	hm.put(3,"Chirag");
	hm.put(4, "Danish");
	
	System.out.println(hm.get(1));
	System.out.println(hm.get(2));
	System.out.println(hm.get(3));
	System.out.println(hm.get(4));	
	
	System.out.println(hm.get(1));
	return hm.get(1);
}

}
