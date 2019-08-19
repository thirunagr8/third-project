package interviewprograms;

public class Primenos {

	public static void main(String[] args) {
			int n = 23;
		boolean flag = false;
		for (int i=1;i<n/2;i++)
			if (n%2==0)
			{
				flag = true;
				break;
			}
		if (!flag)
		
			System.out.println("prime number");
			else
				System.out.println("not prime");
		}}
	//}
/*
		int n=27;
		boolean flag = false;
		for (int i = 2;i<n/2;i++)
		{
			if (n%i==0)
				flag= true;
			break;
		}
		if(!flag)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+ " is not a prime number");
	}}*/