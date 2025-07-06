#include<stdio.h>
#include<conio.h>
void main()
{
char ch;
clrscr();
printf("Are you coming with me?\nType y for yes and n for no:");
ch=getchar();
if((ch=='y')||(ch=='Y'))
{
printf("Yes I am coming with you");
}
else if((ch=='n')||(ch=='N'))
{
printf("Let us go later");
}
else
{
printf("Type N or Y");
}
getch();
}