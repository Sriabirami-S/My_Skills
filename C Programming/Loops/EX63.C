#include<stdio.h>
#include<conio.h>
void main()
{
int dig;
long long num;
clrscr();
printf("Enter a number:");
scanf("%lld",&num);
dig=0;
do
  {
  num=num/10;
  dig=dig+1;
  }while(num!=0);
printf("No of digits:%d",dig);
getch();
}