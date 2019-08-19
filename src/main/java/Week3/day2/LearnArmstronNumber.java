package Week3.day2;

public class LearnArmstronNumber {

	public static void main(String[] args) {
		int c=0;
		int temp,a;

		int n=153;
		temp =n;
		while (n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}if(temp==c)

			System.out.println(c+" is armstrong");
		else 
			System.out.println(c+" is not armstrong");

	}

}
