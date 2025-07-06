#include<stdio.h>
#include<conio.h>
void main()
{
int i;
clrscr();
for(i=1;i<=30;i++)
 {
 if(i==15)
  continue;
  printf("%d ",i);
 }
getch();
}