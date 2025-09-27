class H
{
	void m1(String a)
	{
		System.out.println(a);
	}
	int m2()
	{
		return 2;
	}
	public static void main(String[] args)
	{
		H obj=new H();
		obj.m1("lohi");
		System.out.println(obj.m2());
	}
}