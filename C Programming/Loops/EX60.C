#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,num,countp,countn;
clrscr();
printf("Enter the value of n:");
scanf("%d",&n);
countp=0;
countn=0;
for(i=0;i<=n;i++)
  {
  printf("Enter a number:");
  scanf("%d",&num);
    if((num>0)&&(num!=0))
      {
      countp=countp+1;
      }
    else if((num<0)&&(num!=0))
      {
      countn=countn+1;
      }

  }
printf("\nNumber of positive numbers=%d",countp);
printf("\nNumber of negative numbers=%d",countn);
getch();
}
