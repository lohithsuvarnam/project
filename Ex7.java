
import java.util.Scanner;
class Ex7
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	float m1(String b)
	{
		System.out.println(b);
		return sc.nextFloat();
	}
	static int m2(float c)
	{
		System.out.println(c);
		Ex7 x=new Ex7();
		System.out.println(x.m1(sc.next()));
		return sc.nextInt();
	}
	String m3(int d)
	{
		System.out.println(d);
		System.out.println(m2(sc.nextFloat()));
		return sc.next();
	}
	public static void main(String[] args)
	{
		Ex7 y=new Ex7();
		System.out.println(y.m3(sc.nextInt()));
		System.out.println(y.a);
	}
}
		