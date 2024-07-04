// Q) WAP to pass 'n' numbers from Command line argument & print sum?

import java.util.*;
import java.lang.*;

public class CmdNSum
{
	public static void main(String[]st)
	{
		int i, s=0;
		for(i=0;i<st.length;i++)
		{
			s = s + Integer.parseInt(st[i]);
		}
		System.out.print("\n Sum = "+s);
	}
}