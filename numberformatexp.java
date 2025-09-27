import java.util.*;
class A
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int a=0;
		try
		{
			a=Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception Handeled");
		}
		System.out.print(a);
	}
}