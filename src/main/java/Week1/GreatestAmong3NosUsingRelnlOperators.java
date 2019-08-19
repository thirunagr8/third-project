package Week1;

import java.util.Scanner;
/*
public class GreatestAmong3NosUsingRelnlOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		System.out.println("Enter the third number");
		int num3 = sc.nextInt();
		if (num1>num2 && num1>num3)
		{
			System.out.println(num1 +" is greater");
		}
		else if (num2>num3)
		{
			System.out.println(num2 +" is greater");
		}
		else 
		{
			System.out.println(num3 + " is greater");
		}
	}

}



public class GreatestAmong3NosUsingRelnlOperators{
public static void main(String [] args)
{
	int n = 23;
boolean flag = false;
for (int i=2;i<n/2;i++)
{
flag = true;
if (n%i==0)
break;
}

if (!flag)

System.out.println("The no is prime");
else 
System.out.println("No is not prime");
}}

 */

public class GreatestAmong3NosUsingRelnlOperators{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of 3 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a>b && a>c) {
			System.out.println("a is greater");
		}
			
			else if (b>c) {
				System.out.println("b is greater");
			}
				else 
				{
					System.out.println("c is greater");
			}
		}}