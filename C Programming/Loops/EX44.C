#include<stdio.h>
#include<conio.h>
void main()
{
int a,b;
clrscr();
a=0;
b=0;
printf("\n\n\n\n\n\n\n\n");
while(a<9)
  {
  b=0;
  printf("\t\t\t\t");
  while(b<10)
    {
    printf("* ");
    b++;
    }
  printf("\n");
  a++;
  }
getch();
}