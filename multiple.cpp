#include<iostream>
using namespace std;
class Base1
{
	public:
		int i,j;
		Base1()
		{
			cout<<"Base1 constructor\n";			
		}
		~Base1()
		{
				cout<<"Base1 Destructor\n";
		}
};

class Base2
{
	public:
	int a,b,c;
	Base2()
	{
		cout<<"Base2 constructor\n";
	}
	~Base2()
	{
		cout<<"Base2 destructor\n";
	}
};

class Derived : public Base1, private Base2
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

int main()
{
	Derived dobj;
	return 0;
}