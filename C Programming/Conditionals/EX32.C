//nested if
#include<stdio.h>
#include<conio.h>
void main()
{
int a;
clrscr();
printf("Enter the value of a:");
scanf("%d",&a);
if(a<=0)
{
if(a==0)
{
printf("a is equal to 0");
}
else
{
printf("a is negative");
}
}
else
{
printf("a is positive");
}
getch();
}

