#include<stdio.h>
#include<conio.h>
void main()
{
int i,j,r1,c1,r2,c2,a[10][10],b[10][10],prod[10][10];
clrscr();
printf("Enter the row and column limit of a matrix:");
scanf("%d %d",&r1,&c1);
printf("Enter the row and column limit of b matrix:");
scanf("%d %d",&r2,&c2);
printf("Enter the elements of a matrix:\n");
for(i=0;i<r1;i++)
  {
  for(j=0;j<c1;j++)
    {
    scanf("%d",&a[i][j]);
    }
  }
printf("Enter the elements of b matrix:\n");
for(i=0;i<r2;i++)
  {
  for(j=0;j<c2;j++)
    {
    scanf("%d",&b[i][j]);
    }
  }
for(i=0;i<r1;i++)
  {
  for(j=0;j<c2;j++)
    {
    prod[i][j]=a[i][j]*b[i][j];
    }
  }
printf("The product of a and b is:\n");
for(i=0;i<r1;i++)
  {
  for(j=0;j<c2;j++)
    {
    printf("%d ",prod[i][j]);
    }
  printf("\n");
 }
getch();
}
