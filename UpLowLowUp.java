// Q) WAP to convert uppercase to lowercase & lowercase to uppercase?

import java.util.*;

public class UpLowLowUp
{
	public static void main(String[]st)
	{
		Scanner scan = new Scanner(System.in);
		String str, data="";
		int i;

		System.out.print("ENTER STRING: ");
		str = scan.nextLine();

		for(i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>=65 && ch<=90)
			{
				ch = (char)(ch+32);	
			}
			else if(ch>=97 && ch<=122)
			{
				ch = (char)(ch-32);
			}
			data = data + ch;
		}
		System.out.println("\n CONVERTED : "+data);
	}
}