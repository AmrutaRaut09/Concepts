#include<iostream>
using namespace std;
class Base
{
	public:
		int i,j;
		Base()
		{
			cout<<"\nBase constructor";			
		}
		~Base()
		{
				cout<<"Base Destructor\n"
		}
};
class Derived:public Base
{
	public:
	int a,b,c;
	Derived()
	{
		cout<<"Derived constructor\n";
	}
	~Derived()
	{
		cout<<"derived destructor\n"
	}
};
int main()
{
	Derived dobj;
	return 0;
}