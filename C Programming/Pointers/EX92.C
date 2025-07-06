#include<stdio.h>
#include<conio.h>
void main()
{
int n;
clrscr();
printf("Enter a number:");
scanf("%d",&n);
printf("Number=%d\nAddress=%u",n,&n);
getch();
}
