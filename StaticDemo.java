import java.lang.*;

class StaticDemo
{
	public static void main(String arr[])
	{
		
			Demo2.gun();
			Demo2 obj;
			obj=new Demo2();
			obj.fun();
			System.out.println(obj.i);
			System.out.println(obj.j);		
	}
}

class Demo2
{
	public int i;
	public int j;
	public static int k;
	public Demo2()
	{
		this.i=0;
		this.j=0;
	}
	public void fun()
	{		
		System.out.println("Inside fun");
		System.out.println(this.i);
		System.out.println(this.j);
		System.out.println(this.k);
	}
//static lock is used to initialise static member of a class
	public static void gun()
	{
		System.out.println("Inside static gun");		
		k=98;
	}
}