#include<iostream>
using namespace std;

class Demo
{
	public:
		int x;
		int y;
		
		Demo(int i=10,int j=20)
		{
			x = i;
			y = j;
		}		
};

Demo operator +(Demo op1)
{
	return op1;
}

Demo operator -(Demo op1)
{
	return Demo(-op1.x,-op1.y);
}
int main()
{
	Demo obj1(11,21);
	
	Demo obj2(51,101);
	
	Demo robj1(0,0);
	Demo robj2(0,0);
	
	robj1 =+obj1;
	cout<<robj1.x<<"\n";
	cout<<robj1.y<<"\n";
	
	robj2 =-obj2;
	cout<<robj2.x<<"\n";
	cout<<robj2.y<<"\n";
	
	return 0;
}