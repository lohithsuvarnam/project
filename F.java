class F
{
	static float a=1.25f;
	String b="hello";
	void m1(long a)
	{
		System.out.println(a);
	}
	static void m2(float a)
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		System.out.println(a);
		F obj=new F();
		System.out.println(obj.b);
		obj.m1(123);
		obj.m2(1.2f);
	}
}