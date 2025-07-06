//addition of two matrix using arrays
#include<stdio.h>
#include<conio.h>
void main()
{
int i,j,r1,c1,r2,c2,a[50][50],b[50][50],add[50][50];
clrscr();
printf("Enter the row and column size of a matrix:");
scanf("%d %d",&r1,&c1);
printf("Enter the row and column size of b matrix:");
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
    add[i][j]=a[i][j]+b[i][j];
    }
  }
printf("The added matrix is\n");
for(i=0;i<r1;i++)
  {
  for(j=0;j<c2;j++)
    {
    printf("%d ",add[i][j]);
    }
  printf("\n");
  }
getch();
}