package programming;

import java.util.HashSet;
import java.util.Iterator;

public class HasSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet treeset, LinkedHashset implement set interface
		//doesnot accept duplicate value
		//there is no garantee elements stored in sequential order.. it's in random order

		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("INDIA");
		hs.add("He");
		hs.add("She");
		System.out.println(hs);
		System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		//Iteraor 
		
	Iterator<String>	itr = hs.iterator();
	while(itr.hasNext())  //hasNext will check is the next index is present or not
	{
		System.out.println(itr.next());  // next()-  will move to next index 
	}
		
		
		
		
	}

}
