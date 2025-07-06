//arithmetic operators
#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,c;
clrscr();
a=10,b=4;
c=a+b;printf("The added value of a and b is %d\n",c);
c=a-b;printf("The subtracted value of b from a is %d\n",c);
c=a*b;printf("The multiplied value of a and b %d\n",c);
c=a/b;printf("The divided value ofa by b is %d\n",c);
c=a%b;printf("The modulo divided value of a by b is %d",c);
getch();
}