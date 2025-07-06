#include<stdio.h>
#include<conio.h>
void main()
{
int i,j,a[3][3],n;
clrscr();
n=3;
printf("Enter the elements of matrix:\n");
for(i=0;i<n;i++)
  {
  for(j=0;j<n;j++)
    {
    scanf("%d",&a[i][j]);
    }
  }
printf("The elements of the matrix:\n");
for(i=0;i<n;i++)
  {
  for(j=0;j<n;j++)
    {
    printf("%d ",a[i][j]);
    }
    printf("\n");
  }
getch();
 }