#include<iostream>
using namespace std;

class Demo
{
	public:
		int i,j;
		static int x;
		Demo()
		{
				cout<<"inside default constructor\n";
				i=10;
				j=20;
		}
		
};
int Demo::x=30;

int main()
{
	
	cout<<Demo::x<<"\n";
	
	Demo dobj1;
	Demo dobj2;
	cout<<sizeof(dobj1)<<"\n";		//8
	cout<<sizeof(dobj2)<<"\n";			//8
	
	cout<<dobj1.i;
	cout<<"\n"<<dobj2.i;
	return 0;
}