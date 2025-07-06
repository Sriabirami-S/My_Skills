#include<stdio.h>
#include<conio.h>
void main()
{
int m;//m-mark
clrscr();
printf("Enter the mark:");
scanf("%d",&m);
if((m<=100)&&(m>=90))
{
printf("The student's grade is A");
}
else if((m<=89)&&(m>=80))
{
printf("\nThe student's grade is B");
}
else if((m<=79)&&(m>=70))
{
printf("\nThe student's grade is C");
}
else if((m<=69)&&(m>=50))
{
printf("\nThe student's grade is D");
}
else
{
printf("\nThe student is fail");
}
getch();
}