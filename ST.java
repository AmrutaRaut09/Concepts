import java.lang.*;
import java.util.*;

class ST
{
public static void main(String ar[])
{
	Stack <Student> obj = new Stack<Student>();
	Student s1 = new Student(11,"Amit",89);
	Student s2 = new Student(21,"Saavi",93);
	Student s3 = new Student(51,"Kia",80);
	Student s4 = new Student(101,"Sachin",97);
	
	obj.push(s1);
	obj.push(s2);
	obj.push(s3);
	obj.push(s4);
	Student ref =null;
	Iterator iobj =  obj.iterator();
	 while(iobj.hasNext())
	 {
		ref = (Student)iobj.next();
		ref.Display();		
	 }
	
    System.out.println("Poped element is "+ref.name);
	ref = obj.pop();
}
}
class Student
{
	public int rNo;
	public String name;
	public int Marks;
	
	public Student (int a,String str, int b)
	{
		this.rNo=a;
		this.name= str;
		this.Marks = b;
	}
	public void Display()
	{
	 System.out.println("Roll no: " +this.rNo+ " Name " +this.name+ " Marks " +this.Marks);
	}
}
