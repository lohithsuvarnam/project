class E
{
	void m1(String a)
	{
		System.out.println(a);
	}
	void m2(boolean b)
	{
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		E obj=new E();
		obj.m1("lohi");
		obj.m2(true);
	}
}