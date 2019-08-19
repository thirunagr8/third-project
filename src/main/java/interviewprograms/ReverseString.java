package interviewprograms;

public class ReverseString {

	public static void main(String[] args) {
		String str = "mam";
		String reverse = "";

		int len = str.length();
		for (int i =0;i<=len-1;i++)
		{
			str.toCharArray();

			reverse = reverse+str.charAt(i);
	
		if (reverse.equalsIgnoreCase(str))

			System.out.print("palindrome");
		else
			System.out.println("not palindrome");
		}
	}

}
