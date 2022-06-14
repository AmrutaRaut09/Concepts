#include<stdio.h>
#include<stdlib.h>

int main(int argc, char *argv[])
{
	int ans=0;
	printf("Jay Ganesh\n");
	printf("Name of executable is:%s\n",argv[0]);
	printf("Number of Command line arguments are:%d\n",argc);
	
	ans= atoi(argv[1])+atoi(argv[2]);
	printf("Addition is:%d",ans);
	 return 0;
}



// gcc CommandLine.c -o myexe
//myexe 10 11
