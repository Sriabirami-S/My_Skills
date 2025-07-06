#include<stdio.h>
#include<conio.h>
int min(int a[],int);
int max(int a[],int);
void main()
{
int a[10],i,n,min_elt,max_elt;
clrscr();
printf("Enter the size of array:");
scanf("%d",&n);
printf("Enter the elements of array:");
for(i=0;i<n;i++)
 {
 scanf("%d",&a[i]);
 }
min_elt=min(a,n);
printf("The minimum element:%d",min_elt);
max_elt=max(a,n);
printf("The maximum element:%d",max_elt);
getch();
}
int min(int a[],int n)
{
int minf,i;

minf=a[0];
for(i=1;i<n;i++)
  {
  if(minf>a[i])
   {
   minf=a[i];
   }
   }
return minf;

}
int max(int a[],int n)
{
int maxf,i;
maxf=a[0];
for(i=1;i<n;i++)
 {
 if(maxf<a[i])
  {
  maxf=a[i];
  }
  }
return maxf;
}
