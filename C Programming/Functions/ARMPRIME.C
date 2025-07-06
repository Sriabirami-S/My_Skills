#include<stdio.h>
#include<conio.h>
#include<math.h>
void prime(int);
void arm(int);
void main()
{
int n;
clrscr();
printf("Enter a number:");
scanf("%d",&n);
prime(n);
arm(n);
getch();
}
void prime(int n)
{
int i,isprime=1;
for(i=2;i<=sqrt(n);i++)
 {
 if(n%i==0)
  {
  isprime=0;
  break;
  }
 }
if(n==1)
 {
 printf("neither prime nor composite");
 }
if(isprime==1)
 {
 printf("prime");
 }
else
printf("not prime");
}
void arm(int n)
{
int rem,sum=0,num;
num=n;
while(n!=0)
 {
 rem=n%10;
 sum=sum+(rem*rem*rem);
 n=n/10;
 }
if(sum==num)
printf("\narmstrong");
else
printf("\nnot armstrong");
}