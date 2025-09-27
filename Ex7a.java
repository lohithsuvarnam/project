
import java.util.*;
class Ex7
{
	static Scanner sc=new Scanner(System.in);
	static Ex7 obj=new Ex7();
	int a=sc.nextInt();
	float m1(String b)
	{
		System.out.println(b);
		return sc.nextFloat();
	}
	static int m2(float c)
	{
		System.out.println(c);
		System.out.println(obj.m1(sc.next()));
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
		System.out.println(obj.m3(sc.nextInt()));
		System.out.println(obj.a);
	}
}
		