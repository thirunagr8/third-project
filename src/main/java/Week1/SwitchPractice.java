package Week1;

import java.util.Scanner;

public class SwitchPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		String choice = sc.nextLine();
		String day;
		switch(choice) {
		case "one":
			System.out.println( "Monday");
			break;
		case "two":
			System.out.println("Tuesday");
			break;
		case "Three":
			System.out.println("Wednesday");
			break;
		case "Four":
			System.out.println("Thursday");
			break;
		case "Five":
			System.out.println("Friday");
			break;
		case "Six":
			System.out.println("Saturday");
			break;
		case "Seven":
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Dont know what it is");
			break;
		}

	}
}

