#include<stdio.h>
#include<conio.h>
int main()
{
int a;
clrscr();
printf("Enter the age of the voter:");
scanf("%d",&a);
if(a>=18)
  {
  printf("\nThe person is eligible for voting");
  }
else
  {
  printf("\nThe person is not eligible for voting");
  }
getch();
return 0;
}