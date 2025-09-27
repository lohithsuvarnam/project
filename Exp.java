import java.util.Scanner;
class Exp
{
	static Scanner sc=new Scanner(System.in);
	static int a=sc.nextInt();
	static float b=sc.nextFloat();
	String c=sc.next();
	Boolean d=sc.nextBoolean();
	void m1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}
	void m2()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}
	public static void main(String[] args)
	{
		Exp x=new Exp();
		x.m1();
		Exp y=new Exp();
		y.m2();
		
	}
}
		
	