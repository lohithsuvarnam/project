import java.util.Scanner;
class Ex6
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
		System.out.println(d);
		Ex6 obj=new Ex6();
		System.out.println(obj.m1(sc.next()));
		System.out.println(a);
		System.out.println(obj.b);

	}
	public static void main(String[] args)
	{
		m2(sc.nextFloat());
		
	}
	
}
	
	