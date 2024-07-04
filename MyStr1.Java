// StringBuffer(To insert, delete, reverse)

import java.util.*;

public class MyStr1
{
	public static void main(String[]st)
	{
		String s1 = "VYOMESH MISTRY";
		StringBuffer sb = new StringBuffer(s1);

		s1 = ""+sb.insert(8,"DEEPAK");
		System.out.println("\n s1 = "+s1);

		sb = new StringBuffer(s1);
		s1 = ""+sb.delete(8,14);

		s1 = ""+sb.reverse();
		System.out.println("\n s1 = "+s1);
	}
}