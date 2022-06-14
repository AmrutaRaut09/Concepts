import java.lang.*;

class SpecificOOP
{
	public static void main(String arg[])
	{
		Arithmetic obj = new Arithmetic(10, 11);
		int ret=0;
		ret = obj.Addition(10,11);
		System.out.println("Addition is:"+ret);		
	}
}

class Arithmetic
{
		public int No1;
		public int No2;
		Arithmetic(int a, int b)
		{
			No1=a;
			No2=b;
		}
		public int Addition(int No1,int No2)
		{
			int Ans=0;
			Ans = No1+No2;
			return Ans;
		}
}
