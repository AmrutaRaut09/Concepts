#include<iostream>
using namespace std;
class Base
{
	public:
		int i,j;
		Base()
		{
			cout<<"Base constructor\n";			
		}
		~Base()
		{
				cout<<"\nBase Destructor\n";
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
		cout<<"derived destructor\n";
	}
};

class Derived1: public Derived
{
	
	public:
	int a,b,c;
	Derived1()
	{
		cout<<"Derived constructor\n";
	}
	~Derived1()
	{
		cout<<"derived destructor\n";
	}
};

int main()
{
	Derived dobj;
	return 0;
}