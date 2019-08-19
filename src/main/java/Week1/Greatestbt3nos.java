package Week1;

import java.util.Scanner;

public class Greatestbt3nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number");
		int n2 = sc.nextInt();
		System.out.println("Enter the third number");
		int n3 = sc.nextInt();
		if (n1>n2) {
			if (n2>n3)
				System.out.println(n1+" is greater");
		}

		if (n1>n3) {
			System.out.println(n2+ " is greatest");}
		else
		{
			System.out.println(n3+ " is super greatest");
		}}}

