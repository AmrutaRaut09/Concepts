import java.lang.*;

class Object1
{
	public static void main(String a[])
	{
		Employee eobj=new Employee("Amruta",40000);
		System.out.println(eobj.toString());
	}
	
}
class Employee
{
	public String name;
	public int salary;
	
	public Employee(String str, int num)
	{
		this.name= str;
		this.salary= num;
	}
	
	public String toString()
	{
		return "Employee Name is "+name+"  Having Salary "+salary;
	}
}