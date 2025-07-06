#include<stdio.h>
#include<conio.h>
void main()
{
int a[5],min,max,avg,i,n,sum;
clrscr();
sum=0;
avg=0;
printf("Enter the size of array:");
scanf("%d",&n);
printf("Enter the elements of array:\n");
for(i=0;i<n;i++)
 {
 scanf("%d",&a[i]);
 }
min=a[0];
for(i=1;i<n;i++)
 {
 if(min>a[i])
  {
  min=a[i];
  }
 }
max=a[0];
for(i=1;i<n;i++)
 {
 if(max<a[i])
  {
  max=a[i];
  }
 }
for(i=0;i<n;i++)
 {
 sum=sum+a[i];
 }
avg=sum/n;
printf("The least element=%d",min);
printf("\nThe greatest elemrnt=%d",max);
printf("\nThe average of elements=%d",avg);
getch();
}
