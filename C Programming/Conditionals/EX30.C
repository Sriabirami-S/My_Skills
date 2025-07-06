//greatest among three numbers
#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,c;
clrscr();
printf("Enter the value of a,b,c:");
scanf("%d,%d,%d",&a,&b,&c);
if((a>b)&&(a>c))
{
printf("a is max");
}
if((b>a)&&(b>c))
{
printf("b is max");
}
if((c>a)&&(c>b))
{
printf("c is max");
}
getch();
}