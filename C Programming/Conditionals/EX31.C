//checking for leap year
#include<stdio.h>
#include<conio.h>
void main()
{
int year;
clrscr();
printf("Enter the year:");
scanf("%d",&year);
if(year%400==0)
{
printf("%d is a leap year",year);
}
else if(year%100==0)
{
printf("\n%d is not a leap year",year);
}
else if(year%4==0)
{
printf("\n%d is a leap year",year);
}
else
{
printf("\n%d is not a leap year",year);
}
getch();
}