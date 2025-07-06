#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,a[50],temp;
clrscr();
printf("Enter the size of array:");
scanf("%d",&n);
printf("Enter the elements of array:\n");
for(i=0;i<n;i++)
 {
 scanf("%d",&a[i]);
 }
temp=a[0];
for(i=1;i<n;i++)
  {
  if(temp>a[i])
    {
    temp=a[i];
    }
  }
printf("The least element:%d",temp);
getch();
}