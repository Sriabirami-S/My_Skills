#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,sum;
clrscr();
printf("Enter the value of n:");
scanf("%d",&n);
i=1;
sum=0;
while(i<=n)
  {
  sum=sum+i;
  i++;
  }
printf("Sum of first %d natural numbers = %d",n,sum);
getch();
}