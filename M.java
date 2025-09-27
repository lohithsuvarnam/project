import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	static long a=sc.nextLong();
	static byte b=sc.nextByte();
	double c=sc.nextDouble();
	char d=sc.next().charAt(0);
	public static void main(String[] args)
	{
		System.out.println(a);
		System.out.println(b);
		A obj=new A();
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
}

