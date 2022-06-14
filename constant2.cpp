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
};
int main()
{

	demo dobj;
	cout<<dobj.j<<"\n";
	cout<<dobj.i<<"\n";

	return 0;
}