import java.lang.*;
import java.util.*;

class V
{
public static void main(String ar[])
{
	Vector <Integer>obj =  new Vector<Integer>(12);
	
	obj.add(10);
	obj.add(11);
	obj.add(20);
	obj.add(51);
	obj.add(102);
	obj.add(67);
	obj.add(111);
	obj.add(77);
	obj.add(141);
	obj.add(124);
	
	obj.add(2);
	obj.add(23);
	obj.add(4);
	obj.add(6);
	obj.add(124);
	obj.add(14);
	
	System.out.println("Capacity of vector: "+obj.capacity());
	System.out.println("Size of vector: "+obj.size());
	int i=0, no=0, cnt=0;
	
	for(i=0;i<obj.size();i++)
	{
		no=obj.get(i);
		if(no%2==0)
		{
			cnt++;
		System.out.println("......." +obj.get(i));
		}	 
	}
	System.out.println("Count is...."+cnt);
	
	Iterator iObj = obj.iterator();
	System.out.println("............iterator...................");
	while(iObj.hasNext())
	{
		System.out.println(iObj.next());
	}
 	obj.clear();
	
}
}