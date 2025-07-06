#include<stdio.h>
#include<conio.h>
void main()
{
int i,a,b,n;
clrscr();
n=6;
b=1;
for(i=1;i<=n;i++)
  {
  for(a=1;a<=b;a++)
    {
    printf("%d ",a);
    }
    b++;
  printf("\n");
  }
getch();
}
