import java.lang.*;


class Demo1
{
	public int i;
	public int k;
	
	public void fun()
	{
		System.out.println("Inside fun");

	}

	public void	gun()
	{	
		System.out.println("Inside gun");

	}
}
class Marvellous
{
	public static void main(String arr[])
	{
		System.out.println("Inside Main");
		Demo1 obj=new Demo1();
		obj.fun();
		obj.gun();
		System.out.println("")
	}
}