import java.lang.*;

class Hash
{
    public static void main(String ar[]) throws Exception
    {
		String str1= "Marvellous";
		String str2= "Marvellous";
		String str3= "Infosystem";
		Demo dobj= new Demo();
		
		System.out.println("Hashcode of str1:"+str1.hashCode());
		System.out.println("Hashcode of str2:"+str2.hashCode());
		System.out.println("Hashcode of str3:"+str3.hashCode());
		System.out.println("Hashcode of Dobj:"+dobj.hashCode());		
	}
}

class Demo
{
	
}