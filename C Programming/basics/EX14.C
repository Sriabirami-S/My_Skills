//increment 4
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int a,b;
a=10;
b=++a;
printf("The value of b=%d",b);
b=a++;
printf("The value of b=%d",b);
printf("The value of a=%d",a);
getch();
}