//reversing a number
#include<stdio.h>
#include<conio.h>
void main()
{

long long n,rev,t,rem;
clrscr();
printf("Enter a number:");
scanf("%lld",&n);
rev=0;
t=n;
do
 {
 rem=t%10;
 rev=rev*10+rem;
 t=t/10;
 }while(t!=0);
printf("Reversed number of %lld = %lld",n,rev);
getch();
}