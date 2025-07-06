#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,sum,a[7];
clrscr();
sum=0;
n=6;
for(i=0;i<n;i++)
 {
 printf("Enter a number:");
 scanf("%d",&a[i]);
 }
for(i=0;i<n;i++)
 {
 sum=sum+a[i];
 }
printf("Sum=%d",sum);
getch();
}
