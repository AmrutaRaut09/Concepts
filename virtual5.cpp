#include<iostream>
using namespace std;

class base
{
	public:
			int x,y;
			void fun()
			{
				cout<<"Inside base Fun..."<<"\n";
			}
			virtual void gun()
			{
				cout<<"Inside base gun..."<<"\n";
			}
			virtual void run()
			{
				cout<<"Inside base run..."<<"\n";
			}
			 void sun()
			{
				cout<<"Inside base Sun..."<<"\n";
			}
};

class Derived : public base
{
	int i,j;
			void fun()
			{
				cout<<"Inside Derived Fun..."<<"\n";
			}
			virtual void gun()
			{
				cout<<"Inside Derived gun..."<<"\n";
			}
			virtual void mun()
			{
				cout<<"Inside Derived mun..."<<"\n";
			}
		    void sun()
			{
				cout<<"Inside Derived Sun..."<<"\n";
			}
};
int main()
{
	
	base *bp = new Derived();   		//upcasting
	bp->fun();
	bp->gun();
	bp->run();
	bp->sun();
	
	return 0;
}
