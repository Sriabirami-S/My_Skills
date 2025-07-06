#include<stdio.h>
#include<conio.h>
void main()
{
int i,fact,n;
clrscr();
fact=1;
printf("Enter the value of n:");
scanf("%d",&n);
for(i=1;i<=n;i++)
  {
  fact=fact*i;
  }
printf("The factorial of %d =%d",n,fact);
getch();
}