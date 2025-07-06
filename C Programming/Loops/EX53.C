//program to count the number of odd nos
#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,num,counto;
clrscr();
printf("Enter the value of n:");
scanf("%d",&n);
counto=0;
for(i=0;i<n;i++)
  {
  printf("Enter the number:");
  scanf("%d",&num);
    if(num%2!=0)
      {
      counto=counto+1;
      }
  }
printf("\nNumber of odd numbers=%d",counto);
getch();
}