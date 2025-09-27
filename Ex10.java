
import java.util.*;
class Ex10
{
	static Scanner sc=new Scanner (System.in);
	static boolean m1()
	{
		System.out.println("m1");
		return sc.nextBoolean();
	}
	float m2(int a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	public static void main (String[] args)
	{
		if(m1()==true)
		{
			Ex10 obj=new Ex10();
			System.out.println(obj.m2(sc.nextInt()));
		}
		else
		{
			System.out.println("nothing");
		}
	}
}