import java.util.*;
class Insta
{
    private String username="hello";
    private String password="hi";
    private long phnumber=1234567899l;
    void setName(String username)
    {
        this.username=username;
    }
    void setPass(String password)
    {
        this.password=password;
    }
    String getName()
    {
        return username;
    }
    String getPass()
    {
        return password;
    }
    long  getPh()
    {
        return phnumber;
    }
}
class User
{
    static Scanner sc=new Scanner(System.in);
    static Insta x=new Insta();
    void login()
    {
       System.out.println("Please enter credentials to login : ");
       System.out.print("username : ");
       String username=sc.next();
       System.out.print("password : ");
       String password=sc.next();
       
       if(username.equals(x.getName()) && password.equals(x.getPass()))
       {
           System.out.println("Login successfull ");
       }
       else if(!username.equals(x.getName()) && !password.equals(x.getPass()))
       {
           System.out.print("Invalid credentials press 1 to to know your username or any number to exit : ");
            int n=sc.nextInt();
            if(n==1)
            {
                while(true)
		{
                    System.out.print("Enter your mobile number : ");
                    long phno=sc.nextLong();
                    if(phno==x.getPh())
                    {
                        System.out.println("your username : "+x.getName());
                        System.out.print("press 1 to login or any key to exit : ");
                        char ch=sc.next().charAt(0);
                        if(ch=='1')
                        {
                            login();
                        }
                        else
			{
                        	System.out.println("Thank you..");
			}
                        break;
                   }
                   else
                   {
                        System.out.print("User not found\npress 1 to re-enter or any key to exit : ");
                        char c=sc.next().charAt(0);
                        if(c!='1')
                        {
                            System.out.println("Thank you..");
                            break;
                        }
                   }
                }
            }
            else
            System.out.println("Thank you..");
       }
       else if(!username.equals(x.getName()))
       {
           System.out.print("Invalid username press 1 to reset or any key to exit : ");
           char ch1=sc.next().charAt(0);
           if(ch1=='1')
           {
              System.out.print("Enter new username : ");
              x.setName(sc.next());
              System.out.println("new Username : "+x.getName());
                System.out.print("press 1 to login or any key to exit : ");
                char ch=sc.next().charAt(0);
                if(ch=='1')
                {
                    login();
                }
                else
                System.out.println("Thank you..");
           }
           else
           {
              System.out.println("Thank you.."); 
           }
       }
       else
       {
           System.out.print("Invalid password press 1 to reset or any key to exit : ");
           char ch1=sc.next().charAt(0);
           if(ch1=='1')
           {
              System.out.print("Enter new password : ");
              x.setPass(sc.next());
              System.out.println("new password : "+x.getPass());
                System.out.print("press 1 to login or any key to exit : ");
                char ch=sc.next().charAt(0);
                if(ch=='1')
                {
                    login();
                }
                else
                System.out.println("Thank you..");
           }
           else
           {
              System.out.println("Thank you.."); 
           }
       }
    }
	public static void main(String[] args)
	 {
		new User().login();
	}
}
