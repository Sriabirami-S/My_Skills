#include<stdio.h>
#include<conio.h>
int fact(int);
void main()
{
int n;
int factorial;
clrscr();
printf("Enter a number:");
scanf("%d",&n);
factorial=fact(n);
printf("The factorial of %d=%d",n,factorial);
getch();
}
int fact(int n)
{
if(n==0)
{
return 1;
}
else
{
return (n*fact(n-1));
}
}