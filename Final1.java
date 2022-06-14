import java.lang.*;

class Final1
{
	public static void main(String arg[])
	{
		Demo obj = new Demo();
		obj.fun();		
		Demo obj2=new Demo(110, 120);
		obj2.fun();
		System.out.println(obj2.i);	
	System.out.println(obj2.j);
		System.out.println(obj2.k);		120
		System.out.println(obj.k);		30
	}	
}
class Demo
{
	public int i;
	public final int j=20;
	public final int k;
	
	public Demo()			//constructor
	{
			this.i =10;
			this.k=30;
	}
	public Demo(int a, int b)	//Parameterized Constructor
	{
		this.i=a;
		this.k=b;
	}
	public void fun()
	{
		i++;
		//j++;		//NA
		//k++;		//NA
	}
}
