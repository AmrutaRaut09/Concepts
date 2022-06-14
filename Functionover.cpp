#include<iostream>
using namespace std;

class Demo
{
	public:
	
	//Addition@2ii
	int Addition(int no1, int no2)		//1000 address
	{
		int Ans=no1+no2;
		return Ans;
	}
	//Addition@3iii			name mangling or naming changing
	int Addition(int no1, float no2, int no3)	//2000 address
	{
		int Ans=no1+no2+no3;
		return Ans;
	}
	//Addition@4iiii		
	float Addition(int no1, int no2, int no3, int no4)	//3000 address
	{
		
		int Ans=no1+no2+no3+no4;
		return Ans;
	}
};
int main()
{
	Demo obj;
	int Ret=0;

	//PUSH 10		Assembly instruction
	//PUSH 11
	//CALL 1000
	Ret=obj.Addition(10,11);		//obj.Addition2ii(10,11);
	cout<<Ret<<"\n";
	//PUSH 10
	//PUSH 11
	//PUSH 12
	//CALL 2000
	Ret=obj.Addition(10,11,333);	//obj.Addition3iii(10,11,12);
	cout<<Ret<<"\n";
	
	//PUSH 10
	//PUSH 11
	//PUSH 12
	//PUSH 14
	//CALL 3000
	Ret=obj.Addition(10,11,12,14);		//obj.Addition4iiii(10,11,12,14);
	cout<<Ret<<"\n";
	
	return 0;
}
