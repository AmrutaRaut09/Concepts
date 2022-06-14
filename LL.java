import java.lang.*;
import java.util.*;

class LL
{
	public static void main(String arg[])
	{
		LinkedList <String> obj = new LinkedList<String>();
		
		obj.add("January");
		obj.add("February");
		obj.add("March");
		obj.add("April");
		obj.add("May");
		obj.add("Marvellous");
		obj.add("Marvellous");
		obj.add("Marvellous");
		obj.add(6,"June");
		
		String str="Marvellous";
		int cnt=0;
		
		System.out.println("Arraylist contains:"+obj);
		System.out.println("Size:" +obj.size());
		System.out.println("For loop..");
		
		for(int i=0;i<obj.size();i++)
		{
		 //System.out.println(obj.get(i));
		 if(str.equals("Marvellous"))
		 {
			 	cnt++;
		 }
		}
		 System.out.println("Count of string "+cnt);
		 
		Iterator iObj= obj.iterator();
		System.out.println("			Iterator ...");
		while(iObj.hasNext())
		{
			System.out.println(iObj.next());
		}
		
		
		if(obj.contains("April"))
		{
			System.out.println("Element is present..");
		}	
		//int ret = obj.IndexOf("May");
		//System.out.println("Element is at:"+ret);
		
		System.out.println("Element at index 3 "+obj.get(3));
		obj.remove(3);
		System.out.println("Updated list is "+obj);
		obj.clear();
		System.out.println("Updated list is "+obj);
		
	}
	
}