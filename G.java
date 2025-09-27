class G
{
	void m1(Boolean a)
	{
		System.out.println(a);
	}
	static void m2(int b, float c)
	{
		System.out.println(b+" "+c);
	}
	void m3(String d,double e,char f)
	{
		System.out.println(d+" "+e+" "+f);
	}
	public static void main(String[] args)
	{
		G obj=new G();
		obj.m1(true);
		G.m2(5,1.2f);
		obj.m3("hi",1.256,'R');
	}
}
	