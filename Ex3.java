import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	static long m1(String a, boolean b)
	{
		System.out.println(a+" "+b);
		return sc.nextLong();
	}
	short m2(int d, double e)
	{
		System.out.println(d+" "+e);
		return sc.nextShort();
	}
	public static void main(String[] args)
	{
		Ex3 obj=new Ex3();
		String a=sc.next();
		boolean b=sc.nextBoolean();
		System.out.println(A.m1(a,b));
		int d=sc.nextInt();
		double e=sc.nextDouble();
		System.out.println(obj.m2(d,e));
	}
}
	
