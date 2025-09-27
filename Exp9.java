import java.util.*;
class A
{

	static Scanner sc=new Scanner(System.in);
	static A m1()
	{
		return new A();	
	}
	short m2(float a)
	{
		System.out.print(a);
		return sc.nextShort();
	}
	public static void main(String[] args)
	{
		System.out.print(m1().m2(sc.nextFloat()));
	}
}