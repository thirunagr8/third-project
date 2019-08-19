package Week1;

public class SumOfOddnosBtw50To100 {

	public static void main(String[] args) {
		int sum = 0;
		// TODO Auto-generated method stub
		for (int i = 50;i<=57 ;i++)
		{
			if (i%2 !=0)
			{
				sum = sum+i;

			}
		}System.out.println(sum);
	}
}