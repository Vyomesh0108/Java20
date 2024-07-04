import java.util.*;

public class BreakLable
{
	public static void main(String[]st)
	{
		int i,j,k;
		
		vyomesh:
		for(k=1;k<=5;k++)
		{
			darsh:
			for(i=1;i<=10;i++)
			{
				for(j=1;j<=10;j++)
				{
					System.out.print(" "+j);
					if(j==5)
					{
						// break;
						// break darsh;
						break vyomesh;
					}
				}
				System.out.print("  ==   "+i);

				System.out.print("\n");
			}
		}
	}
}