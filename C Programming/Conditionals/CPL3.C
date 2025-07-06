#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,c;
clrscr();
printf("Enter the value of a and b:");
scanf("%d %d",&a,&b);
c=a+b;
printf("\nThe addition of a and b = %d",c);
c=a-b;
printf("\nThe subtraction of a and b = %d",c);
c=a*b;
printf("\nThe multiplication of a and b = %d",c);
c=a/b;
printf("\nThe quotient of a by b = %d",c);
c=a%b;
printf("\nThe remainder of a and b = %d",c);
getch();
}