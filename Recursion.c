#include<stdio.h>

DisplayI(int no)
{
	int i=1;
	
	static int i=1;
	if(i<=no)
	{
		printf("*\n");
		i++;
	}
}

DisplayR(int no)
{
	static int i=1;
	if(i<=no)
	{
		printf("*\n");
		i++;
		DisplayR(no);
	}
}

int main()
{
	int iValue=3;
	DisplayR(iValue);
	
	return 0;
}