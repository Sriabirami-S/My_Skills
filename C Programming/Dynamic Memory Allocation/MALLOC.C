#include<stdio.h>
#include<conio.h>
#include<malloc.h>
void main()
{
int i,n,arr[10],*ptr,sum;
clrscr();
n=3;
sum=0;
ptr=(int*)malloc(n*sizeof(n));
ptr=&arr[0];
printf("Enter no:");
for(i=0;i<n;i++)
 {
  scanf("%d",&ptr[i]);
  sum=sum+ptr[i];
  }
printf("sum=%d",sum);
getch();
}