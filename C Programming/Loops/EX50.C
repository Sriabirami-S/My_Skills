#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,sum;
clrscr();
n=5;
sum=0;
for(i=1;i<=n;i++)
  {
  sum=sum+i;
  }
printf("The sum of first five numbers is %d",sum);
getch();
}