import java.util.*;

public class MyToken
{
	public static void main(String[]args)
	{
		String s1 = "Compact Computer Institute";

		StringTokenizer st = new StringTokenizer(s1,"o");

		System.out.println("\n Count = "+st.countTokens());

		while(st.hasMoreTokens())
		{
			System.out.println(" "+st.nextToken());
		}
		System.out.println("\n Count = "+st.countTokens());
	}
}