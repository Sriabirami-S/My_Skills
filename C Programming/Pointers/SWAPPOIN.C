#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,*p1,*p2,swap;
clrscr();
a=5;
b=10;
p1=&a;
p2=&b;
printf("a=%d\nb=%d\naddress of a=%u\naddress of b=%u",a,b,p1,p2);
printf("\nBefore swap:\n*p1=%d\n*p2=%d",*p1,*p2);
swap=*p1;
*p1=*p2;
*p2=swap;
printf("\nAfter swapping:\n*p1=%d\n*p2=%d",*p1,*p2);
getch();
}