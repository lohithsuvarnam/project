import java.util.*;
class Instagarm
{
	private String password="hello@123";
	void setter(String password)
	{
		this.password=password;
	}
	String getter()
	{
		return password;
	}
}
class User
{
	public static void main(String[] args)
	{
		Instagarm x=new Instagarm();
		x.setter("Root25");
		System.out.print(x.getter());
	}
}