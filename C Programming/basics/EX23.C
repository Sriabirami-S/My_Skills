#include<stdio.h>
#include<conio.h>
void main()
{
int dividend,divisor,answer;
clrscr();
printf("Enter the value of dividend and divisor:");
scanf("%d,%d",&dividend,&divisor);
printf("The value of dividend=%d,divisor=%d",dividend,divisor);
answer=dividend/divisor;
printf("\nThe quotient is %d",answer);
answer=dividend%divisor;
printf("\nThe remainder is %d",answer);
getch();
}