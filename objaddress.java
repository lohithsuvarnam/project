
class A
{
	public static void main(String[] args)
	{
		A x=new A();
		System.out.println(x);
		System.out.println(x.getClass().getName()+"@"+Integer.toHexString(x.hashCode()));
	}
}