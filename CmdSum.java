// Q) WAP to pass 2 numbers from command line arguments & print it's addition?

import java.util.*;
import java.lang.*;

public class CmdSum
{
	public static void main(String[]st)
	{
		int x = Integer.parseInt(st[0]);
		int y = Integer.parseInt(st[1]);
		
		System.out.print("\n Addition = "+(x+y));

			// OR

		int s = x + y;
		System.out.print("\n Sum = "+s);
	}
}