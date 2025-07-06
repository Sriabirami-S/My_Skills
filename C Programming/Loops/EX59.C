#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,mark,tot,avg;
clrscr();
printf("Enter the value of n:");
scanf("%d",&n);
tot=0;
avg=0;
for(i=1;i<=n;i++)
  {
  printf("Enter the mark:");
  scanf("%d",&mark);
  tot=tot+mark;
  avg=tot/n;
  }
printf("\ntotal=%d",tot);
printf("\naverage=%d",avg);
getch();
}

