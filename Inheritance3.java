import java.lang.*;

class Inheritance2
{
	public static void main(String a[])
	{
		System.out.println("inside main");
		Derived dobj = new Derived();
		dobj.sun();
	}	
}

class Base
{
		public int i;
		public int j;
		
		public Base(int a, int b)
		{
			System.out.println("Inside Base Constructor");
			this.i=a;
			this.j=b;
		}		
		public void fun()
		{
			System.out.println("Inside Base fun");
		}
		public void gun()
		{
			System.out.println("Inside Base gun");
		}
}

class Derived extends Base
{
		public int x;
		public int y;
		
		public Derived()		//Constructor
		{
			super(11,21);
			this.x=30;
			this.y=40;
			
			System.out.println("Inside Derived Constructor");
		}
		public void sun()
		{
			System.out.println("Inside derived sun");
			System.out.println(super.i);
			System.out.println(super.j);
			super.fun();
		}
}