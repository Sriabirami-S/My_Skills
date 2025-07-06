#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
int i,j,n;
clrscr();
printf("Enter the value of n:");
scanf("%d",&n);
for(i=1;i<=sqrt(n);i++)
 {
 for(j=2;j<i;j++)
  {
  if(i%j==0)
   {
   continue;
   }
   break;
  }
   printf("%d\n",i);
   continue;
 }
getch();
}
