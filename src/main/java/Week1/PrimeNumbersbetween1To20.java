package Week1;

public class PrimeNumbersbetween1To20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag = 1;
		//int n = 33;
		for (int j = 2; j<=20;j++)
		{
			flag = 0;
			for (int i = 2;i<=j/2;i++)
			{
				if (j%i ==0)
				{
					flag = 1;
					break;
				}}


			if (flag ==0)
				System.out.println(j);//"it is a prime no");
			//	else 
			//	System.out.println("Not a prime");
		}

	}}

