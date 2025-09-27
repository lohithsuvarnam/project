import java.util.*;
class Instagarm
{
	private String username="lohithsuvarnam";
	private String password="hello@123";
	void setter(String username, String password)
	{
		this.username=username;
		this.password=password;
	}
	String getname()
	{
		return username;
	}
	String getpass()
	{
		return password;
	}
}
class A
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Instagarm x=new Instagarm();
		System.out.println("Enter new username");
		String user=sc.next();
		System.out.println("Enter new password");
		String password=sc.next();
		x.setter(user,password);
		System.out.println("New Username="+x.getname());
		System.out.println("New Password="+x.getpass());
	}
}