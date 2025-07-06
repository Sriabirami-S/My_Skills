#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,a,b;
clrscr();
n=6;
b=1;
for(i=1;i<=n;i++)
  {
  for(a=1;a<=b;a++)
    {
     printf("* ");
    }
    b++;
  printf("\n");
  }
getch();
}