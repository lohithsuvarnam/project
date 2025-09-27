import java.util.*;
interface I
{
	Scanner sc=new Scanner(System.in);
	int m1(float a);
	public static void main(String[] args)
	{
		I x=(a)->
		{
			System.out.println(a);
			return sc.nextInt();
		};
		System.out.println(x.m1(sc.nextFloat()));
	}
}