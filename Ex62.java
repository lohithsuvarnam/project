import java.util.*;
interface I1
{
	static Scanner sc=new Scanner(System.in);
	default long m1(String a)
	{
		System.out.println(a);
		return sc.nextLong();
	}
	default int m2(double a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	boolean m3(float a);
	float m4(int a);
}
class A implements I1
{
	public boolean m3(float a)
	{
		System.out.println(a);
		return sc.nextBoolean();
	}
	public float m4(int a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	public static void main(String[] args)
	{	
		A x=new A();
		System.out.println(x.m1(sc.next()));
		System.out.println(x.m2(sc.nextDouble()));
		System.out.println(x.m3(sc.nextFloat()));
		System.out.println(x.m4(sc.nextInt()));
	}
}


	 