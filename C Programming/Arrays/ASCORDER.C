#include<stdio.h>
#include<conio.h>
void main()
{
int i,j,n,num[20],a;
clrscr();
printf("Enter the number of elements:");
scanf("%d",&n);
printf("Enter the elements of array:\n");
for(i=0;i<n;i++)
 {
 scanf("%d",&num[i]);
 }
for(i=0;i<n;i++)
 {
 for(j=i+1;j<n;j++)
  {
  if(num[i]>num[j])
    {
    a=num[i];
    num[i]=num[j];
    num[j]=a;
    }
  }
 }
printf("The elements after arranging in ascending order:\n");
for(i=0;i<n;i++)
  {
  printf("%d\n",num[i]);
  }
getch();
}