//forming right triangle using 1 and 0
#include<stdio.h>
#include<conio.h>
void main()
{
int i,a,b,x,n;
clrscr();
x=1;
n=6;
b=1;
for(i=1;i<=n;i++)
  {
  for(a=1;a<=b;a++)
    {
     if(x==1)
       {
       printf("%d ",x);
       x=x-1;
       }
     else
       {
       printf("%d ",x);
       x=x+1;
       }
    }
    b++;
    printf("\n");
   }
getch();
}
