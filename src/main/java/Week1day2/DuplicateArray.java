package Week1day2;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40,10,20};
		int n =a.length;
		for (int i = 0;i<n;i++)
		{
			for (int j = 1;j<n;j++)
			{
				if (a[i] == a[j] && i != j)
				{
					System.out.println("The repeated array is "+a[i]);
				} 
			}

		}

	}}