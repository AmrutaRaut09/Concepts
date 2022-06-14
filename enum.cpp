#include<iostream>
using namespace std;

int main()
{
			  //0	1	2	3	4	5	  6	   7
	enum Days{Sun, Mon, Tue, wed, Thurs, Fri, Sat};	//Text section memory
	enum Days obj;
	obj = Tue;
	cout<<obj<<"\n";
	cout<<"Obj size  "<<sizeof(obj)<<"\n";		//integer
	
	enum gender{female=1, male};
	
	cout<<"1:female"<<"\n";
	cout<<"2:male \n";
	cout<<"Enter your gender\n";
	int Input=0;
	cin>>Input;
	switch(Input)
	{
		case female:
			cout<<"Tax limit 300000";
			break;
			
		case male:
		cout<<"Tax free limit is 250000";
		break;
		default:
		cout<<"Invalid input";
	}
	return 0;
}