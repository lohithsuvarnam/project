import java.util.*;
class Instagarm
{
	private String username="lohithsuvarnam";
	private String password="hello@123";
	void setname(String username)
	{
		this.username=username;
	}
	void setpass(String password)
	{
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
	Instagarm(String username,String password)
	{
		this.username=username;
		this.password=password;
	}
	Instagarm()
	{

	}
}
class A
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Instagarm x=new Instagarm();
		System.out.println("Enter your choice \nusername\npassword\nboth");
		String choice=sc.next();
		if(choice.equals("username"))
		{
			System.out.println("Enter new username");
			x.setname(sc.next());
			System.out.println("New username="+x.getname());
		}
		else if(choice.equals("password"))
		{
			System.out.println("Enter new password");
			x.setpass(sc.next());
			System.out.println("New password="+x.getpass());
		}
		else if(choice.equals("both"))
		{
			System.out.println("Enter new username");
			String name=sc.next();
			System.out.println("Enter new password");
			String pass=sc.next();
			x=new Instagarm(name,pass);
			System.out.println("New username="+x.getname());
			System.out.println("New password="+x.getpass());
		}
		else
		{
			System.out.println("Invalid choice");
			main(args);
		}
	}
}
			