
#include<iostream>
namespace Marvellous
{
	void fun()
	{
		std::cout<<"Inside Fun\n";
		
	}
}

namespace Infosystem
{
	void fun()
	{
		std::cout<<"inside Infosystem fun\n";
		
	}
}

int main()
{
	std::cout<<"Jay Ganesh\n";
	
	//Marvellous::fun();
	Infosystem::fun();
	
	return 0;
	
}