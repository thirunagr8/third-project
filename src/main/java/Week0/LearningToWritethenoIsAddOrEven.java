package Week0;

import java.util.Scanner;

/*public class LearningToWritethenoIsAddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find out Add Or Even");
		int n = sc.nextInt();
		if(n%2==0) 
			System.out.println("The entered number is even");
		else 
			System.out.println("The entered number is odd");   	
	}

}

 */

public class LearningToWritethenoIsAddOrEven {
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Number please");
		int n = sc.nextInt();

		if (n%2==0) 
			System.out.println("No is even");
		else
			System.out.println("Odd");


	}
}