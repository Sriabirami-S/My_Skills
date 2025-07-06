#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,number,counte,counto,tote,toto;
clrscr();
printf("Enter the value of n:");
scanf("%d",&n);
counte=0;
tote=0;
counto=0;
toto=0;
for(i=1;i<=n;i++)
  {
  printf("Enter the numbers:");
  scanf("%d",&number);
   if(number%2==0)
    {
    counte=counte+1;
    tote=tote+number;
    }
   else
   {
   counto=counto+1;
   toto=toto+number;
   }
  }
printf("\nNo of even numbers=%d\nTotal of even numbers=%d\n\nNo of odd numbers=%d\nTotal of odd numbers=%d",counte,tote,counto,toto);
getch();
}


