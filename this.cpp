#include<iostream>
using namespace std;

class Demo
{
	public:
		int x;
		int y;
		Demo(int a=10, int b=20)
		{
			x=a;
			y=b;
			
		}
};

int main()
{
	Demo obj;
	cout<<obj.x<<"\n";
	
	Demo obj1(11);
	cout<<obj1.x<<"\n";
	Demo obj2(11,21);
	cout<<"\nx="<<obj2.x;
	cout<<"\ny="<<obj2.y;
	return 0;
}