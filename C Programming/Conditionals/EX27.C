//using !=(not equal to)
#include<stdio.h>
#include<conio.h>
int main()
{
int age;
clrscr();
printf("Enter the age of the user:");
scanf("%d",&age);
if(age!=36)
{
printf("The user is eligible for recruitment");
}
else
{
printf("The user is not eligible for recruitment");
}
getch();
return 0;
}