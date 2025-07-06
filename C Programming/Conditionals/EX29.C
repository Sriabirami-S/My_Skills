//using relational operators and logical operator||(logical OR)
#include<stdio.h>
#include<conio.h>
void main()
{
int mark,att;//att-attendance
clrscr();
printf("Enter the value of mark and attendance:");
scanf("%d,%d",&mark,&att);
if((mark>75)||(att>=90))
{
printf("The student is an outstanding student");
}
else
{
printf("The student is not an outstanding student");
}
getch();
}
