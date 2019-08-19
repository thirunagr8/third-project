package Week1day2;

import java.util.Scanner;
/*
public class PalindromeStringorNot {

	public static void main(String[] args) {
		String original,reverse ="";
		System.out.println("Enter the string to be tested Palindrome or not");
		Scanner sc = new Scanner(System.in);
		original = sc.nextLine();
		int len = original.length();
		for (int i = 0; i>len-1;i--)

			reverse = reverse+original.charAt(i);
		if (original.equals(reverse))
		{
			System.out.println("It is a palindrome");
		}
		else 
		{
			System.out.println("It is not a palindrome");
		}
	}

}*/


public class Palindrome {
	public static void main (String[] args)
	{ String reverse = ""; 
	String str = "mam";
	int len = str.length();
	for (int i = 0;i>len-1;i--)
		reverse = reverse+str.charAt(i);
	if (str.equals(reverse))

		System.out.println("palindrome");

	else

		System.out.println("not palindrome");

	}}