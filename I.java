class I
{
	static String m1(boolean a)
	{
		return "hi";
	}
	boolean m2()
	{
		return true;
	}
	public static void main (String[] args)
	{
		I obj=new I();
		System.out.println(obj.m2());
		System.out.println(m1(obj.m2()));
	}
}
		
			
		
