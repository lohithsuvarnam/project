class B
{
  	int a=14;
  	float b=2.5f;
	static String c="hi";
	void m1()
	{
		float d=1.2f;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	public static void main(String[] args)
	{
		B obj=new B();
		obj.m1();
	}
}
		