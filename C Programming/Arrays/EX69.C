#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,a[10],counto,counte;
clrscr();
counto=0;
counte=0;
printf("Enter the value of n:");
scanf("%d",&n);
for(i=0;i<n;i++)
  {
  printf("Enter a number:");
  scanf("%d",&a[i]);
   if(a[i]%2==0)
     {
     counte=counte+1;
     }
   else
     {
     counto=counto+1;
     }
  }
printf("No of even numbers:%d",counte);
printf("\nNo of odd numbers:%d",counto);
getch();
}