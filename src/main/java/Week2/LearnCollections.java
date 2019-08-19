package Week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myPhones =  new ArrayList();
		//ArrayList<char> a =new ArrayList();

		myPhones.add("Nokia");
		myPhones.add("SonyEriccson");
		myPhones.add("Samsung");
		myPhones.add("Motorola");
		myPhones.add("Samsung");
		myPhones.add("Redmi");
		myPhones.add("nokia");
		myPhones.remove(4);
		//boolean abc = true;
		//boolean abc = myPhones.contains("nokia");
		//System.out.println(abc);

		//System.out.println(abc);
		//System.out.println("Total no of mobiles are " +myPhones.size());
		//int len =  myPhones.size();
		//System.out.println(myPhones.get(len-2));

		Collections.sort(myPhones);
		//System.out.println(myPhones);
		for (String eachmobile : myPhones) {
			System.out.println(eachmobile);	
		}
	}

}
