class A
{
	static java.util.Scanner sc=new java.util.Scanner(System.in);
	String a=sc.next();
	A()
	{
		System.out.println("Default");
	}
	A(long a)
	{
		System.out.println(a);
		
	}
	A(boolean a,int b)
	{
		System.out.println(a+" "+b);
		new A(sc.nextLong());
	}
	A(A x)
	{
		System.out.println(a);
		new A(sc.nextBoolean(),sc.nextInt());
		System.out.println(x.a);
	}
	public static void main(String[] args)
	{
		new A(new A());
	}
} 