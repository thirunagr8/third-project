package Week1day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*public class NoOfOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		//char c ='a';
		//char ch = (char)(c-32);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str =  sc.nextLine();
		String out = str.toLowerCase();
		char[] allcha = out.toCharArray();

		int len = allcha.length;

		for(int i= 0;i<=len-1;i++) {// (char eachchar : allcha )
			if (allcha[i] =='a')
				// count = str.indexOf('a') ;
				//count = count++;

				count =count+1;
		}
		System.out.println(count);
	}


}
*/
/*	public static void main(String[] args) {
		String s= "java";
		Map<String, Integer> map = new HashMap<String, Integer>();
		char[] ch = s.toCharArray();
		for(char c : ch){
			String str = c+"";
			if(!map.containsKey(str)){
				map.put(str, 1);
			}else{
				map.put(str, map.get(str)+1);
			}
		}
		System.out.println(map);
	}}*/

public class NoOfOccurence {
	public static void main (String[] args)
	
	{
		int count = 0;
		String str = "thirunavukkarasu";
		int len = str.length();
		char[] arr = str.toCharArray();
		char c = 'a';
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == c) {
				count++;
			}
		}
		/*for (char ch : arr) {
			if (ch == c) {
				count++;
			}
		}*/
		 System.out.println(count);
	}
	
}