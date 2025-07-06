//relational operators
#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,c,d,e,f,g,h;
clrscr();
printf("Enter the value of a and b:");
scanf("%d %d",&a,&b);
c=a<b;
d=a>b;
e=a<=b;
f=a>=b;
g=a==b;
h=a!=b;
printf("\na<b=%d\na>b=%d\na<=b=%d\na>=b=%d\na==b=%d\na!=b=%d",c,d,e,f,g,h);
getch();
}