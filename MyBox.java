import java.util.*;

class Box
{
	int len, wid, area;
	Box()
	{
		System.out.println("\n IN CONSTRUCTION "+len+" : "+wid);
	}

	Box(int l, int w)
	{
		len = l;
		wid = w;
		
		System.out.println("\n\n IN PARAM CONSTRUCTOR "+len+" : "+wid);
	}

	Box(int l)
	{
		len = l;
		wid = l;

		System.out.println("\n\n IN PARAM CONSTRUCTOR "+len+" : "+wid);
	}

	void Box()
	{
		System.out.println("\n     IN METHOD = "+len+" , "+wid);
	}

	void show()
	{
		System.out.println("\n     IN METHOD = "+len+" , "+wid);
	}

	void show(int a)
	{}

	void show(int a, int b)
	{}

	void show(float a)
	{}
}

public class MyBox
{
	public static void main(String[]st)
	{
		Box b1 = new Box();
		// b1.Box();
		b1.show();
		Box b2 = new Box(5, 6);
		b2.show();
		Box b3 = new Box(10, 20);
		b3.show();
		Box b4 = new Box(100);
		b4.show();
	}
}