#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,rev,rem,count,num,temp;
clrscr();
n=5;
rem=0;
rev=0;
count=0;
for(i=1;i<=n;i++)
  {
  printf("Enter a number:");
  scanf("%d",&num);
  temp=num;
  rev=0;
    while(num!=0)
      {
      rem=num%10;
      rev=rev*10+rem;
      num=num/10;
      }
      printf("%d)temp=%d",i,temp);
      printf("\n%d)reverse=%d\n",i,rev);
      if(temp==rev)
	{
	count=count+1;
	}
   }
printf("\nNo of palindromes:%d",count);
getch();
}
