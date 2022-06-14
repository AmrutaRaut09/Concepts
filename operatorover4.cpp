#include<iostream>
using namespace std;

class Demo
{
	public:
		int x;
		int y;
		
		Demo(int 0,int j=0)
		{
			x = i;
			y = j;
		}
};

Demo operator ++(Demo &op1)		//pre
{
	cout<<"inside 1st ++\n"	;
	op1.x++;
	op1.y++;
	
	return op1;
}

Demo operator ++(Demo &op1, int)	//post  int is dummy argument
{
	cout <<"inside 2nd ++\n";
	op1.x++;
	op1.y++;
	
	return Demo(op1.x-1, op1.y-1);
}

int main()
{
	Demo obj1(10,20);
	Demo obj2(10,20);
	
	Demo robj1(0,0);
	Demo robj2(0,0);
	
	robj1 = ++obj1;	
	cout<<obj1.x<<"  "<<obj1.y<<"\n";
	cout<<robj1.x<<"  "<<robj1.y<<"\n";
	
	robj2 = obj2++;	
	cout<<obj2.x<<"  "<<obj2.y<<"\n";
	cout<<robj2.x<<"  "<<robj2.y<<"\n";
	
	return 0;
}