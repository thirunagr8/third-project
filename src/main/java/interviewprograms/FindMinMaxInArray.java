package interviewprograms;

import java.util.Arrays;
import java.util.Collections;

public class FindMinMaxInArray {

	public static void main(String[] args) {
		int[] a = {11,12,3,7,18,8,9};
		//	int l = a.length;
		for (int i=0;i<6;i++)
		{

			for (int j=i;j<6;j++)
			{
				if (a[i]>a[j])	
				{
					int num1=0;
					num1=a[i];
					a[i]=a[j];
					a[j]=num1;
				}
			}
		}
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
		//Collections.sort(a);

	}


}
