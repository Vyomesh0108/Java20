// Q) WAP to pass string from command line & check whether it is Palindrome or not?

import java.util.*;

public class CmdPalindrome
{
	public static void main(String[]st)
	{
		String s = st[0];
		StringBuffer sb = new StringBuffer(s);
		String t = ""+sb.reverse();

		if(s.equals(t))
		{
			System.out.print("\n It is Palindrome");
		}
		else
		{
			System.out.print("\n It is not Palindrome");
		}
	}
}