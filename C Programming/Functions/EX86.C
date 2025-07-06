#include<stdio.h>
#include<conio.h>
void mul();
void line(void);
void main()
{
clrscr();
mul();
getch();
}
void mul()
{
int a,b;
a=5;
b=7;
line();
printf("The value of a=%d",a);
printf("\nThe value of b=%d\n",b);
line();
printf("\nThe product of a and b=%d\n",a*b);
line();
}
void line()
{
int i;
for(i=0;i<80;i++)
  {
  printf("_");
  }
}