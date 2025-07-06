#include<stdio.h>
#include<conio.h>
void main()
{
int n,num,rev,rem,i;
clrscr();
rev=0;
rem=0;
printf("Enter a number:");
scanf("%d",&num);
n=num;
while(num!=0)
  {
  rem=num%10;
  rev=rev*10+rem;
  num=num/10;
  }
if(n==rev)
  {
  printf("Palindrome");
  }
else
 {
 printf("Not a palindrome");
 }
getch();
}
