package week2day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnListSetnMap {
	public static void main(String[] args) {
		/*List<String> a = new LinkedList<>();
	a.add("Thiru");
	a.add("hari");
	a.add("Gopi");
	a.add("Raj");
	a.remove(2);
	boolean c = a.contains("Raj");
//	System.out.println(c);
	//a.contains("Raj");
int 	b = a.size();
//System.out.println(b);
	Collections.sort(a);
	for (String st : a) {
		System.out.println(st);

	}
}
}
		 */
		Set<String> hs = new TreeSet<String>();
		hs.add("Mari");
		hs.add("Kari");
		hs.add("Soori");
		hs.add("Pari");
		hs.remove("Pari");
		boolean b = hs.contains("Oari");
		System.out.println(b);
		System.out.println(hs.size());
	}}