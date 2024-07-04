// 2D Array

import java.util.*;

public class TwoDArray
{
	public static void main(String[]st)
	{
		Scanner scan = new Scanner(System.in);
		int r,c,i,j;

		System.out.print("Enter Rows: ");
		r = scan.nextInt();
		int a[][] = new int[r][];

		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter Columns: ");
			c = scan.nextInt();
			a[i] = new int[c];
		}	
		
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print("Enter No: ");
				a[i][j] = scan.nextInt();
			}
		}

		int s=0;
		for(int x[] : 0)
		{
			for(int y:x)
			{
				System.out.print("   "+y);
				s = s+y;
			}
			System.out.print("\n");
		}
	}
}