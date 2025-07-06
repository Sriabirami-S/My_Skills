#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,prod;
clrscr();
n=20;
prod=1;
for(i=1;i<=n;i++)
  {
  prod=2*i;
  printf("%d*2=%d\n",i,prod);
  }
getch();
}