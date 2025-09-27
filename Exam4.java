import java.util.*;
class Employee
{
	static Scanner sc=new Scanner(System.in);
	String emp_name;
	int emp_id;
	double emp_sal;
	Employee m1(String a,int b,double c)
	{
		a=emp_name;
		b=emp_id;
		c=emp_sal;
		emp_name=sc.next();
		emp_id=sc.nextInt();
		emp_sal=sc.nextDouble();
		return new Employee();
	}
	void display()
	{
		System.out.println(m1(emp_name));
		System.out.println(m1(emp_id));
		System.out.println(m1(emp_sal));
	}
	public static void main(String[] args)
	{
		Employee obj=new Employee();
		for(int i=1;i<=3;i++)
		{
			obj.display(sc.next(),sc.nextInt(),sc.nextDouble());
		}
	}
}
	