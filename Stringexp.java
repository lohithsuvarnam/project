import java.util.*;
class A
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		try
		{
			System.out.print(s.charAt(sc.nextInt()));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.print("Exeption Handeled");
		}
	}
}