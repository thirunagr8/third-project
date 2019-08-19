package week2day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {
	public static void main(String[] args) {

		//Set <String> myPhones =  new HashSet <String>();
		//ArrayList<char> a =new ArrayList();
		List<String> myPhones =  new ArrayList();
		myPhones.add("nokia");
		myPhones.add("SonyEriccson");
		myPhones.add("Samsung");
		myPhones.add("Motorola");
		myPhones.add("Samsung");
		myPhones.add("Redmi");
		myPhones.add("nokia");
		//System.out.println(myPhones);
		//	boolean abc = myPhones.contains("nokia");
		//System.out.println(abc);
		Set <String> lsd =  new HashSet <String>();
		lsd.addAll(myPhones);
		System.out.println(lsd);
		//System.out.println(lsd);
		/*	List<String> lst =  new ArrayList();
	lst.addAll(lsd);
	String st  = lst.get(1);
	System.out.println(st);
		 */	
	}

}
