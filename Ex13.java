import java.util.*;
class Ex13
{
	static Scanner sc=new Scanner(System.in);
	int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	int m2(boolean b)
	{
		System.out.println(b);
		return m1(sc.nextFloat());
	}
	static int m3(String c)
	{
		System.out.println(c);
		Ex13 obj=new Ex13();
		return obj.m2(sc.nextBoolean());
	}
	public static void main(String[] args)
	{
		System.out.println(m3(sc.next()));
	}
}
		
	
	