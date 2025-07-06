//program to multiply upto n numbers
#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,factorial;
clrscr();
printf("Enter the value of n:");
scanf("%d",&n);
factorial=1;
for(i=1;i<=n;i++)
  {
  factorial=factorial*i;
  }
printf("Factorial of %d = %d",n,factorial);
getch();
}