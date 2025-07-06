#include<stdio.h>
#include<conio.h>
void main()
{
int a;
float b;
char c;
clrscr();
printf("Enter a  whole number:");
scanf("%d",&a);
printf("Enter an integer:");
scanf("%f",&b);
c='x';
printf("Number=%d\t\tAddress of number=%u\n",a,&a);
printf("Integer=%2f\tAddress of integer=%u\n",b,&b);
printf("Character=%c\t\tAddress of character=%u\n",c,&c);
getch();
}