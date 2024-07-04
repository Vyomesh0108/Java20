import java.util.*;

class Box
{
	int len, wid;

	static int count, c;

	Box(int l, int w)
	{
		len = l;
		wid = w;
		c++;	
	}
	
	void show()
	{
		System.out.println("\n LEN : "+len+" WID : "+wid);
		System.out.println("       COUNT    :    "+count);
	}
}

public class MySt
{
	public static void main(String[]st)
	{
		Box b1 = new Box(10, 20);
		Box b2 = new Box(5, 6);
		Box b3 = new Box(100, 200);
		Box b4 = new Box(10, 20);
		Box b5 = new Box(5, 6);
		Box b6 = new Box(100, 200);

		b1.count = 5000;
		b2.count = 1000;
		b3.count = 777;

		b1.show();
		b2.show();
		b3.show();

		System.out.println("\n B1.LEN = "+b1.len);
		System.out.println("\n B1.COUNT = "+b1.count);

		// System.out.println("\n BOX.LEN = "+Box.len);
		System.out.println("BOX.COUNT = "+Box.count);
		System.out.println("\n No.of Objects = "+Box.c);		
	}
}