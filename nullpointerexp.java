import java.util.*;
class A
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=null;
		try
		{
			System.out.print(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.print("Exception Handeled");
			//System.out.println(e);
			//System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}
}









