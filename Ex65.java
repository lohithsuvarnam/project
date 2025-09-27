import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	private long a=sc.nextLong();
	int m1(String a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	class B
	{
		float m2(short b)
		{
			System.out.println(a);
			System.out.println(b);
			return sc.nextFloat();
		}
	}
	public static void main(String[] args)
	{
		A x=new A();
		System.out.println(x.m1(sc.next()));
		A.B y=x.new B();
		System.out.println(y.m2(sc.nextShort()));
	}
}
		

	