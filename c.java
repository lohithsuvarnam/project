class C
{
	static int a;
	static float b;
	String e;
	public static void main (String[] args)
	{
		char d='r';
		System.out.println(a);
		System.out.println(b);
		C obj=new C();
		System.out.println(obj.e);
		System.out.println(d);
		a=14;
		b=2.6f;
		obj.e="Roy";
		System.out.println(a);
		System.out.println(b);
		System.out.println(obj.e);
	}
}