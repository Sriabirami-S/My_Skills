//using less than or equal to operator
#include<stdio.h>
#include<conio.h>
void main()
{
int a,b;
clrscr();
printf("Enter the value of a and b:");
scanf("%d %d",&a,&b);
printf("\na=%d,b=%d",a,b);
if(a<=b)
{
printf("\na is less than or equal to b");
}
else
{
printf("\na is not less than or equal to b");
}
getch();
}
