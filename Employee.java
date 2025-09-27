
import java.util.*;
class Employee
{
	static Scanner sc=new Scanner(System.in);
	void details(int EmployeeId, String EmployeeName, String EmployeeDesignation, Float EmployeeSalary)
	{
		System.out.println("Employee Id="+EmployeeId);
		System.out.println("Employee Name="+EmployeeName);
		System.out.println("Employee Designation="+EmployeeDesignation);
		System.out.println("Employee Salary="+EmployeeSalary);
	}
	public static void main(String[] args)
	{
		Employee obj=new Employee();
		for(int i=1;i<=5;i++)
		{
			obj.details(sc.nextInt(), sc.next(), sc.next(), sc.nextFloat());
		}
	}
}
		