import java.util.*;
class Batch186
{
	static Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
	String s3=sc.next();
	void display()
	{
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
	public static void main(String[] args)
	{
		System.out.println("Enter boys data");
		Batch186 boys=new Batch186();
		System.out.println("Enter girls data");
		Batch186 girls=new Batch186();
		System.out.println("which data you need to display /nBoys/nGirls/nBoth");
		String choice=sc.next();
		switch(choice)
		{
			case "Boys":
					boys.display();
					break;
			case "Girls":
					girls.display();
					break;
			case "Both":
					boys.display();
					girls.display();
					break;
			default:
					System.out.println("Invalid choice");
		}
	}
}
			
					