
import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	static int a=sc.nextInt();
	float b=sc.nextFloat();
	int m1(String c)
	{
		System.out.println(c);
		return sc.nextInt(); 
	}
	static void m2(float d)
	{
		A obj=new A();
		System.out.println(d);
		System.out.println(obj.m1(sc.next()));
	}
	public static void main(String[] args)
	{
		A x=new A();
		System.out.println(a);
		System.out.println(x.b);
		m2(sc.nextFloat());
		
	}
	
}
	
	