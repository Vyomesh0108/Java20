import java.lang.*;
import java.util.*;

public class First
{
	public static void main(String[]st)
	{
		Scanner scan = new Scanner(System.in);
		int no;
		String na;
		float height;
		long sal;

		System.out.print("\n Enter No: ");
		no = scan.nextInt();
		System.out.print("\n Enter Name: ");
		na = scan.next();
		System.out.print("\n Enter Height: ");
		height = scan.nextFloat();
		System.out.print("\n Enter Salary: ");
		sal = scan.nextLong();

		System.out.println("\n No = "+no);
		System.out.println("Name = "+na+" \n Height = "+height+" \n Sal = "+sal);

	}
}