#include<stdio.h>
#include<conio.h>
void main()
{
char a[10];
int i,n;
clrscr();
n=10;
printf("Enter a character:");
for(i=0;i<n;i++)
  {
  scanf("%c",&a[i]);
  }
printf("The characters are:");
for(i=0;i<n;i++)
  {
  printf("%c",a[i]);
  }
getch();
}