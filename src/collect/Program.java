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
		// �÷��� 3����
		
		//Set �� �÷���
		Set s = new HashSet();
		s.add(1);
		s.add(2);
		
		for(Object o : s)
			System.out.println(o);
										
		//List �� �÷���
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		
		for(Object o : list)
			System.out.println(o);
				
		//Map �� �÷���
		Map map = new HashMap();
		map.put("����",1);
		map.put("Ű", 123);
		
		map.get("����");
		
		for(Object k : map.keySet())
			System.out.println(map.get(k));		
		
	}

}





