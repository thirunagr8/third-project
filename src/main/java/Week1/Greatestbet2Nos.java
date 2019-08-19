package Week1;

import java.util.Scanner;

public class Greatestbet2Nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number");
		int n2 = sc.nextInt();
		if (n1>n2)
			System.out.println(n1+" is greater");
		else 
			System.out.println(n2+ " is greatest");
	}}
