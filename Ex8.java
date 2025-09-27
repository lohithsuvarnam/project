import java.util.Scanner;
class Ex8
{
	static Scanner sc=new Scanner(System.in);
	static Ex8 obj=new Ex8();
	int a=sc.nextInt();
	static float b=sc.nextFloat();
	String m1(int c)
	{
		System.out.println(c);
		return sc.next();
	}
	float m2(boolean d)
	{
		System.out.println(d);
		return sc.nextFloat();
	}
	static int m3(float e)
	{
		System.out.println(e);
		System.out.println(obj.m1(sc.nextInt()));
		return sc.nextInt();
	}
	static boolean m4(String f)
	{
		System.out.println(f);
		System.out.println(obj.m2(sc.nextBoolean()));
		return sc.nextBoolean();
	}
	public static void main(String[] args)
	{
		System.out.println(m3(sc.nextFloat()));
		System.out.println(m4(sc.next()));
		System.out.println(obj.a);
		System.out.println(b);
	}
}