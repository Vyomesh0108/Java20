// Q) WAP to pass two members from commondline & find Power.

import java.util.*;
import java.lang.*;

public class CmdPower
{
	public static void main(String[]st)
	{
		int x = Integer.parseInt(st[0]);
		int n = Integer.parseInt(st[1]);
		int i=1, p=1;

		while(i<=n)
		{
			p = p*x;
			i++; 
		}
		System.out.print("\n Power = "+p);
	}
}