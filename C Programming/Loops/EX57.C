#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,mul2,mul3,mul4,mul5;
clrscr();
n=20;
mul2=1;mul3=1;mul4=1;mul5=1;
for(i=1;i<=n;i++)
  {
  mul2=mul2*i;
  mul3=mul3*i;
  mul4=mul4*i;
  mul5=mul5*i;
  printf("%d*2=%d\n",i,mul2);
  printf("\t%d*3=%d\n",i,mul3);
  printf("\t\t%d*4=%d\n",i,mul4);
  printf("\t\t\t%d*5=%d\n",i,mul5);
  }
getch();
}
