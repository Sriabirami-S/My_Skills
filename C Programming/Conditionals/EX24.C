#include<stdio.h>
#include<conio.h>
void main()
{
int a,b;
clrscr();
printf("Enter the value of a and b:");
scanf("%d %d",&a,&b);
printf("\nThe value of a=%d,b=%d",a,b);
if(a<b)
{
printf("\nb is biggest");
}
else
{
printf("\na is biggest");
}
getch();
}
