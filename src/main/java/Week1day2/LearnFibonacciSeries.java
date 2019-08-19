package Week1day2;

public class LearnFibonacciSeries {

	public static void main(String[] args) {
		int t1=0,t2=1,n=5,sum;
		for (int i = 0;i<=n;i++)
		{

			sum = t1+t2;

			t1=t2;
			t2=sum;
			System.out.println(t1);
		}
	}

}
