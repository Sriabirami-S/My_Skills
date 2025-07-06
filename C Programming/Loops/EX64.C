#include<stdio.h>
#include<conio.h>
void main()
{
int n,t,rem,sum;
clrscr();
printf("Enter a number:");
scanf("%d",&n);
t=n;
sum=0;
do
 {
 rem=t%10;
 sum=sum+rem;
 t=t/10;
 }while(t!=0);
printf("The sum of digits:%d",sum);
getch();
}