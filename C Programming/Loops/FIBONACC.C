#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,a,b,c;
clrscr();
a=0;
b=1;
printf("Enter the value of n:");
scanf("%d",&n);
for(i=1;i<=n;i++)
  {
  printf("%d\n",a);
  c=a+b;
  a=b;
  b=c;
  }
getch();
}
