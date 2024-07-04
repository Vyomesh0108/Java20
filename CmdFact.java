// Q) WAP to find factorial using command line argument?

import java.util.*;
import java.lang.*;

public class CmdFact
{
	public static void main(String[]st)
	{
		int i, s=1;
		
		int n = Integer.parseInt(st[0]);

		for(i=1;i<=n;i++)
		{
			s = s*i;
		}
		System.out.println("\n FACTORIAL : "+s);
	}
}