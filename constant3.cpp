#include<iostream>
using namespace std;

class demo
{
	public:
			int i;
			const int j;
			
			demo() : j(20)  //member initialization list for constant characteristics
			{
				i=10;
		//		j=13;	//not allowed
			}
			
			demo(int a, int b):i(a),j(b)
			{
				i=a;
				cout<<"inside parameterised"<<"\n";
			}
};

int main()
{

	demo dobj(11,21);
	cout<<dobj.i<<"\n";
	cout<<dobj.j<<"\n";
	
	dobj.j++;			//j is const so value cant changed
	
	return 0;
}