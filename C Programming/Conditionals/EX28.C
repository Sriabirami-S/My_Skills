//using relational and logical operators
#include<stdio.h>
#include<conio.h>
void main()
{
int experience,age;
clrscr();
printf("Enter the value of experience and age:");
scanf("%d,%d",&experience,&age);
if((experience>=5)&&(age<=35))
{
printf("The person is eligible for recruitment");
}
else
{
printf("The person is not eligible for recruitment");
}
getch();
}