#include<iostream>
using namespace std;

template<class T>
class Arithmetic
{
	public: 
			T No1;
			T No2;
			
			Arithmetic(T a, T b)
			{
				No1=a;
				No2=b;
			}
			T Addition()
			{
				T ans;
				ans= No1+No2;
				return ans;
			}
			
			T Substraction()
			{
				T ans;
				ans= No1-No2;
				return ans;
			}
};

int main()
{	
	Arithmetic <int>iobj(11,10);
	
	int ret = iobj.Addition();
	cout<<"Addition is:"<<ret<<"\n";
	
	Arithmetic <double>dobj(56.78,10.34);
	double dret = dobj.Addition();
	cout<<"Addition is:"<<dret<<"\n";
	
	int sub = iobj.Substraction();
	cout<<"Substraction is:"<<sub<<"\n";
	
	return 0;
}