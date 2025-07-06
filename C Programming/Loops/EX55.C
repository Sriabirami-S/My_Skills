#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,ans;
clrscr();
ans=1;
n=5;
for(i=1;i<=n;i++)
  {
  printf("Enter a number:");
  scanf("%d",&ans);
  ans=ans*10;
  printf("answer=%d\n",ans);
  }
getch();
}



