package week2day2;

import java.util.HashMap;
import java.util.Map;

public class StringContainsDuporNot {
	public static void main(String[] args) {
		String str = "Thirunavukkarasu";
		char[] abc =str.toLowerCase().toCharArray();
		int count =0;
		for (char c : abc) 
			//boolean d = 
			//System.out.println(c);
			if (c=='k')
				count = count +1;
		System.out.println(count);
	}
}