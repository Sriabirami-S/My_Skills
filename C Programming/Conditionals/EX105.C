#include<stdio.h>
#include<conio.h>
void main()
{
int tem;
long bill,unit;
clrscr();
printf("Enter the no of units used:");
scanf("%d",&unit);
tem=unit/100;
printf("The payment amount ");
switch(tem)
 {
 case 0:
  bill=unit*5;
  printf("%ld",bill);
  break;
 case 1:
  bill=unit*10;
  printf("%ld",bill);
  break;
 case 2:
  bill=unit*20;
  printf("%ld",bill);
  break;
 case 3:
  bill=unit*25;
  printf("%ld",bill);
  break;
 default:
  bill=unit*30;
  printf("%ld",bill);
  break;
 }
getch();
}


