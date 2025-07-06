#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,sum;
clrscr();
sum=0;
printf("Enter the value of n:");
scanf("%d",&n);
for(i=1;i<=n;i++)
  {
  sum=sum+i;
  }
printf("Sum of first %d natural numbers = %d",n,sum);
getch();
}