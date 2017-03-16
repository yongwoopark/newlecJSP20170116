package collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		// 컬렉션 3가지
		
		//Set 형 컬렉션
		Set s = new HashSet();
		s.add(1);
		s.add(2);
		
		for(Object o : s)
			System.out.println(o);
										
		//List 형 컬렉션
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		
		for(Object o : list)
			System.out.println(o);
				
		//Map 형 컬렉션
		Map map = new HashMap();
		map.put("나이",1);
		map.put("키", 123);
		
		map.get("나이");
		
		for(Object k : map.keySet())
			System.out.println(map.get(k));		
		
	}

}





