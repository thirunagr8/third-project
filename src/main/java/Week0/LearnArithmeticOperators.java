package Week0;
import java.util.Scanner;
public class LearnArithmeticOperators {
	public static void main(String[] args) {
		int c= 30,d =40;
		Scanner n1 = new Scanner(System.in);		
		System.out.println("Enter the value of n1");
		int a= n1.nextInt();
		System.out.println("Enter the value of n2");
		int	b= n1.nextInt();
		// TODO Auto-generated method stub
		System.out.println("The addition value of a + b is " + (a+b));
		System.out.println("The Subtraction value of b - a is " + (b-a));
		System.out.println("The product value of c * d is " + (c*d));
		System.out.println("The Division value of d / b is " + (d/b));
		System.out.println("The modulus value of c % b is " + (c%b));
	}
}

/*public class LearnArithmeticOperators {
	public static void main (String[] args)
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the value of a");
		a= sc.nextInt();
		System.out.println("Enter the value of b");
		b = sc.nextInt();
		System.out.println("Addition value of a and b is "+ (a+b));
	}
}*/