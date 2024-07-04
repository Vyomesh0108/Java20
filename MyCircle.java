// Q) WAP to find area of circle using Class?

import java.util.*;
import java.lang.*;

class Circle
{
	float pi=3.14f, rad, area;
	Scanner scan = new Scanner(System.in);

	void input()
	{
		System.out.print("Enter Radius: ");
		rad = scan.nextFloat();
	}

	void show()
	{
		area = pi*rad*rad;
		System.out.println("\n Area = "+area);
	}
}

public class MyCircle
{
	public static void main(String[]st)
	{
		Circle c1 = new Circle();
		Circle c2 = new Circle();

		c1.input();
		c2.input();

		c1.show();
		c2.show();
	}
}