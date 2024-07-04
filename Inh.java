import java.util.*;

public class Inh
{
	static int sum(int ... a)
	{
		int s = 0;
		for(int b : a)
		{
			s = s + b;
		}
		return s;
	}
	public static void main(String[]st)
	{
		int x = sum(10, 20);
		System.out.println("\n Sum = "+x);

		x = sum(10, 20, 30, 40, 50);
		System.out.println("\n Sum = "+x);

		x = sum(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
		System.out.println("\n Sum = "+x);
	}
}