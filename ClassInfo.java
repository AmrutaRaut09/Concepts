import java.lang.*;


class ClassInfo
{
		public static void main(String Arg[])
		{
			Demo obj= new Demo();
	
			Class cref = obj.getClass();
			String str="Marvellous";
			Class cref2=str.getClass();
			
			System.out.println("Class name of obj is:"+cref2.getName());
			System.out.println("Class name of obj is:"+cref.getName());
		}
}

class Demo
{
	
	
}