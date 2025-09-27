import java.util.*;
class A
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		try
		{
			System.out.print(a[sc.nextInt()]);
			String s=sc.next();
			try
			{
				System.out.print(s.charAt(sc.nextInt()));
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.print("Exception handeled");	
			}
		}
		catch(ArrayIndexOutOfBoundsException e)	
		{
			System.out.print("Exception handeled");
			String z=sc.next();	
			int x=0;
			try
			{
				x=Integer.parseInt(z);
			}
			catch(NumberFormatException f)
			{
				System.out.print("Exception handeled");	
			}
			System.out.print(x);
		}
	}
}
		