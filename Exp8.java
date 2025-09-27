import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	String std_name=sc.next();
	int std_id=sc.nextInt();
	int std_batch=sc.nextInt();
	void display()
	{
		System.out.println(std_name);
		System.out.println(std_id);
		System.out.println(std_batch);
	}
	public static void main(String[] args)
	{
		System.out.println("Enter student 1 data");
		A std1=new A();
		System.out.println("Enter student 2 data");	
		A std2=new A();
		System.out.println("Enter student 3 data");
		A std3=new A();
		System.out.println("Enter student 4 data");
		A std4=new A();
		System.out.println("which data you need to display \nstd1 \nstd2 \nstd3 \nstd4");
		String choice=sc.next();
		switch(choice)
		{	
			case "std1":
					std1.display();
					break;
			case "std2":
					std2.display();
					break;
			case "std3":
					std3.display();
					break;
			case "std4":
					std4.display();
					break;
			default:
					System.out.print("Invalid choice");
		}
	}
}
	
