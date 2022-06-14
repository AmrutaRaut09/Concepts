#include<iostream>
using namespace std;

class demo
{
	public:
			int Add(int no1, int no2)
			{
				int ans =0;
				ans = no1+no2;
				return ans;
			}

};
int main()
{

	demo dobj;
	cout<<sizeof(dobj)<<"\n";
	
	int ret =0;
	ret =dobj.Add(10,11);
	cout<<ret<<"\n";
	
	return 0;
}