#include<stdio.h>
#include<conio.h>
void main()
{
int m[6],sum,i,n,avg;
clrscr();
n=5;
sum=0;
printf("Enter the marks:\n");
for(i=0;i<n;i++)
  {
  scanf("%d",&m[i]);
  sum=sum+m[i];
  }
avg=sum/5;
printf("Total=%d",sum);
printf("\naverage=%d",avg);
getch();
}
