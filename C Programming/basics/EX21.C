//swapping
#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,c;
clrscr();
a=5,b=3;
printf("The values of a and b before swapping:a=%d,b=%d",a,b);
c=b;
b=a;
a=c;
printf("\nThe values of a and b after swapping:a=%d,b=%d",a,b);
getch();
}