// Q) WAP to enter string & count upper, lower, spaces, digits in a given string?

import java.util.*;

public class CountSpace
{
	public static void main(String[]st)
	{
		Scanner scan = new Scanner(System.in);
		String str;

		System.out.println("ENTER STRING: ");
		str = scan.nextLine();
		int i, u=0, l=0, s=0, d=0, sp=0;

		for(i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>=65 && ch<=90)
			{
				u++;
			}
			else if(ch>=97 && ch<=122)
			{
				l++;
			}
			else if(ch>=48 && ch<=57)
			{
				d++;
			}
			else if(ch==32)
			{
				s++;
			}
			else
			{
				sp++;
			}
		}

		System.out.println("\n UPPER: "+u);
		System.out.println("\n LOWER: "+l);
		System.out.println("\n DIGITS: "+d);
		System.out.println("\n SPACE: "+s);
		System.out.println("\n SPECIAL CHARACTER: "+sp);
	}
}