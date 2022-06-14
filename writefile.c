#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<unistd.h>

int main()
{
	char fname[30];
	int fd = 0;
	int ret=0;
	char Data[11]="Marvellous";
	
	printf("Enter the file name that you want to write into\n");
	scanf("%s",fname);
	
	fd = open(fname,O_RDWR);
	
	if(fd == -1)
	{
		printf("Unable to write file\n");
		return -1;
	}
	else
	{
		printf("File is successfully Opened with fd = %d\n",fd);
	}
	
	ret=write(fd,Data,10);
	
	if(ret==0)
	{
	  printf("File is successfully written with fd %d\n",ret)	;
	}
	return 0;
}

// UFDT = user file descriptor table

