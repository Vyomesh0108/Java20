import java.util.*;

public class MyStr
{
	public static void main(String[]st)
	{
		String s1 = "HELLO SIR";
		System.out.println("\n LEN : "+s1.length());
		String s2 = "HOW ARE YOU";
		s1 = s1+s2;

		System.out.println("\n S1 = "+s1);

		String s3 = s1;
		System.out.println("\n S3 = "+s3);

		s1 = "gtu";
		s2 = "GTU";

		if(s1.equals(s2) == true)
		{
			System.out.println("SAME");
		}
		else
		{
			System.out.println("NOT SAME");
		}

		if(s1.equalsIgnoreCase(s2) == true)
		{
			System.out.println("SAME");
		}
		else
		{
			System.out.println("NOT SAME");
		}

		int l = s1.compareTo(s2);
		if(l>0)
		{
			System.out.println("  "+s1+" IS GREATER");
		}
		else if(l<0)
		{
			System.out.println("   "+s2+" IS SMALLER");
		}
		else if(l==0)
		{
			System.out.println("BOTH ARE SAME");
		}

		s1 = "HELLO WORLD OYE";
		int p = s1.indexOf('O');
		System.out.println("POSITION:"+p);

		p = s1.indexOf('O',5);
		System.out.println("POSITION:"+p);

		p = s1.lastIndexOf('O');
		System.out.println("POSITION:"+p);

		p = s1.indexOf("WOR");
		System.out.println("POSITION:"+p);

		p = s1.indexOf('V');
		System.out.println("POSITION:"+p);

		char ch = s1.charAt(8);
		System.out.println("\n CHAR:"+ch);

		//ch = s1.charAt(38);
		for(int i=0;i<s1.length();i++)
		{
			System.out.print("   "+s1.charAt(i));
		}

		s1 = "BALAGURUSAMY";
		System.out.println("\n "+s1.substring(4,8));
		System.out.println("\n "+s1.substring(4));

		s1 = "TODAY IS A GOOD DAY BUT NOT HOLIDAY";
		s1 = s1.replace("Day","Night");
		System.out.println("\n s1= "+s1);

		s1 = "Vyomesh Mistry";
		s1 = s1.toLowerCase();
		System.out.println("\n s1 = "+s1);

		s1 = s1.toUpperCase();
		System.out.println("\n s1 = "+s1);

		s1 = "    HELLO    SIR   ";
		s2 = s1.trim();
		System.out.println("s1 = "+s1+" = "+s1.length());

		System.out.println("s2 = "+s2+" = "+s2.length());

		s1 = "BALAGURUSAMY";
		System.out.println("\n STARTS WITH BALA: "+s1.startsWith("BALAg"));
		System.out.println("\n STARTS WITH BALA: "+s1.endsWith("MY"));
	}
}