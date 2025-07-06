#include<stdio.h>
#include<conio.h>
void main()
{
int num,n,rem,sum;
clrscr();
sum=0;
printf("Enter a number:");
scanf("%d",&num);
n=num;
while(num!=0)
  {
  rem=num%10;
  sum=sum+rem*rem*rem;
  num=num/10;
  }
if(sum==n)
  printf("Armstrong number");
else
  printf("not an armstrong number");
getch();
}