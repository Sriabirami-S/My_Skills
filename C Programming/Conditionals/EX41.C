#include<stdio.h>
#include<conio.h>
void main()
{
int mark,a;
clrscr();
printf("Enter the mark:");
scanf("%d",&mark);
a=mark/10;
switch(a)
{
  case 10:
  case 9:
    printf("The student's grade is A++");
    break;
  case 8:
    printf("The student's grade is A+");
    break;
  case 7:
    printf("The student's grade is A");
    break;
  case 6:
    printf("The student's grade is B");
    break;
  case 5:
    printf("The student's grade is C");
    break;
  case 4:
    printf("The student's grade is D");
    break;
  default:
    printf("The student is fail");
    break;
    }
getch();
}