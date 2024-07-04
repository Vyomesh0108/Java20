import java.util.*;

class Box
{
	int len, wid, area;
	Box(int len, int wid)
	{
		this.len = len;
		this.wid = wid;
	}

	Box(int l)
	{
		this(l,l);
	}

	void show()
	{
		System.out.println("\n LEN : "+len+", WID : "+wid+", ADD = "+this); 
	}

	public String toString()
	{
		return "from gtu"+len+", "+wid;
	}
}

public class MyBox1
{
	public static void main(String[]st)
	{
		Box b1 = new Box(10, 20);
		Box b2 = new Box(5, 6);
		Box b3 = new Box(100);

		b1.show();
		b2.show();
		b3.show();

		System.out.println("\n B1 = "+b1);
		System.out.println("\n B2 = "+b2);
		System.out.println("\n B3 = "+b3);
	}
}