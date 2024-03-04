package selenium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class My_program {

	public static void main(String[] args) {
		Set<String> s= new HashSet<String>();
		System.out.println(s.size());
		s.add("raghu");
		s.add("raju");
		s.add("naveen");
		System.out.println(s.size());
		Iterator<String> it= s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
 
	}

}
