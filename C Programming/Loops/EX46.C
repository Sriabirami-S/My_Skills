#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,a,b,x,y,s;
clrscr();
n=6;   s=n;
b=1;y=1;
for(i=1;i<=n;i++)
  {
  for(x=s;x>=y;x--)
     {
     printf(" ");
     }s--;
  for(a=1;a<=b;a++)
      {
      printf("* ");
      }b++;
  printf("\n");

  }
getch();
}