#include<stdio.h>
#include<conio.h>
void main()
{
float p,t,si,r;
clrscr();
printf("Enter the principal amount:");
scanf("%f",&p);
printf("Enter the rate of interest per annum:");
scanf("%f",&r);
printf("Enter the time period:");
scanf("%f",&t);
si=(p*r*t)/100;
printf("The simple interest:%f",si);
getch();
}