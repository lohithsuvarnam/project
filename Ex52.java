import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	long m1(String a)
	{
		System.out.println(a);
		return sc.nextLong();
	}
	int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	public static void main(String[] args)
	{
		A x=new A();
		System.out.println(x.m1(sc.next()));
		System.out.println(x.m1(sc.nextFloat()));
	}
}