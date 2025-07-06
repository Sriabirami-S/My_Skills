#include<stdio.h>
#include<conio.h>
void main()
{
int a,*p,b;
clrscr();
printf("Enter the value of a:");
scanf("%d",&a);
p=&a;
b=&p;
printf("Value of pointer variable *p:%d\n",*p);
printf("Address of a:%u\n",p);//address of a
printf("Address of p:%u",b);//address of p
getch();
}