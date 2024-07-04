// IMP Q) WAP to pass n numbers from command line & sort them in descending order?

import java.util.*;
import java.lang.*;

public class CmdSort
{
	public static void main(String[]st)
	{
		int a[] = new int[st.length];
		char ch = st[st.length-1].charAt(0);

		int i, j, t=0;

		for(i=0;i<a.length;i++)
		{
			a[i] = Integer.parseInt(st[i]);
		}

		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(ch == 'A' || ch == 'a')
				{
					if(a[i] > a[j])
					{
						t = a[i];
						a[i] = a[j];
						a[j] = t;
					}
				}
				else
				{
					if(a[i] < a[j])
					{
						t = a[i];
						a[i] = a[j];
						a[j] = t;
					}
				}
			}
		}

		for(i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
	}
}