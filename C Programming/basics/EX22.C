//swapping using two variables
#include<stdio.h>
#include<conio.h>
void main()
{
int a,b;
clrscr();
//op a=3,b=5
printf("Enter the values for a and b");
scanf("%d %d",&a,&b);
printf("The values before swapping:a=%d,b=%d",a,b);
a=a-b;//a=2
b=a+b;//b=5
a=b-a;
printf("\nThe values after swapping:a=%d,b=%d",a,b);
getch();
}
