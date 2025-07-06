#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,a[10],rev[10],r[10];
clrscr();
printf("Enter the value of n:");
scanf("%d",&n);
printf("Enter the elements of array which are to be reversed:\n");
for(i=0;i<n;i++)
  {
  scanf("%d",&a[i]);
  rev[i]=0;
  while(a[i]!=0)
    {
    r[i]=a[i]%10;
    rev[i]=(rev[i]*10)+r[i];
    a[i]=a[i]/10;
    }
  }
printf("The elements after reversing:\n");
for(i=0;i<n;i++)
{
printf("%d\n",rev[i]);
}
getch();
}

