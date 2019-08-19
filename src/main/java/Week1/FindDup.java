package Week1;

import java.util.HashSet;
import java.util.Set;

/*public class FindDup {

	public static void main(String[] args) 
	{

		Integer a[] = {4,4,5,2,2,4,5,6,7,1,2,3};
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++)
		{
			set.add(a[i]);

			for (int j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j] && (i!=j))
				{
					System.out.print(set);
				}
			}
		}
		//System.out.println(j);
	}}*/

public class FindDup {
public static void main (String[] args)
{
int arr[] = {1,2,3,1,2,3,4,5};
 for (int i = 0;i<arr.length-1;i++)
{
for ( int j = i+1;j<arr.length-1;j++)
{
if (arr[i]==arr[j]&&(i!=j)){
	
System.out.println("Duplicate values are" +arr[j]);
}}}}}
