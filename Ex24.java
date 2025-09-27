import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	A()
	{
		System.out.println("ntg");
		System.out.println(a);
	}
	A(int a)
	{
		System.out.println(a);
		A x=new A();
	}
	A(boolean b,String c) 
	{
		System.out.println(b);
		System.out.println(c);
		A x=new A(sc.nextInt());
	}
	A(int d,float e,short f)
	{
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		A x=new A(sc.nextBoolean(),sc.next());
	}
	public static void main(String[] args)
	{
		A y=new A(sc.nextInt(),sc.nextFloat(),sc.nextShort());
		System.out.println(y.a);
	}
}