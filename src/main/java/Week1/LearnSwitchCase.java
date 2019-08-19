package Week1;
import java.util.Scanner;
public class LearnSwitchCase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2");
		int num2 = sc.nextInt();
		System.out.println("Enter the chocie");
		String calc=sc.nextLine();
		//System.out.println("After operation the value is");

		switch(calc)
		{
		case "add":
			int a=	(num1+num2);
			System.out.println(a);
			break;
		case "subt":
			int b=	(num1-num2);
			System.out.println(b);
			break;
		case "multi":
			int c =	(num1*num2);
			System.out.println(c);
			break;
		case "divi":
			int d = (num1*num2);
			System.out.println(d);
			break;
		default:
			System.out.println("Just come out");
		}}}