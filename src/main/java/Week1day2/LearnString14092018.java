package Week1day2;

public class LearnString14092018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "testleaf";
		String output = "";
		char str1[] = str.toCharArray();

		for (int i=1; i < str.length(); i++) {
			if (str1[i]%2!=0) {
				System.out.println(output += Character.toString(str1[i]));
				//output += Character.toLowerCase(str1[i]);
			}/* else {
				output += Character.toLowerCase(str1[i]);
			}*/
		}
		//System.out.println(output);
	}
}	
