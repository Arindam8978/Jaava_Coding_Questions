package programming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Hello");
		hm.put(1, "Hi");
		hm.put(2, "Bye");
		hm.put(42, "Evening");
		System.out.println(hm.get(2));
		hm.remove(42);
		System.out.println(hm.get(42));
		
		
	
	Set sn=	hm.entrySet(); //convert hashmap into set
		Iterator it =	sn.iterator();
		
		//HashTable- pass table set collection
		while(it.hasNext())
		{
			Map.Entry mp=	(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		

	}

}
