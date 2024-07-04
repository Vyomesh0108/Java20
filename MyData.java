// Q) WAP to create dynamic array and enter and show value and also print their sum?

import java.util.*;

public class MyData
{
	public static void main(String[]st)
	{
		Scanner scan = new Scanner(System.in);

		int n,i,s=0;
		
		System.out.print("Enter Element : ");
		n = scan.nextInt();

		int a[] = new int[n];

		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter no: ");
			a[i] = scan.nextInt();
		}

		for(int x:a)
		{
			System.out.print("   "+x);
			s = s + x;
		}
		System.out.println("\n\n Sum = "+s);
	}
}