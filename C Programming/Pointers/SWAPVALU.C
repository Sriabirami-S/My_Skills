#include<stdio.h>
#include<conio.h>
int swap(int*,int*);
void main()
{
int a,b;
clrscr();
a=5;
b=3;
printf("Before swap: %d %d",a,b);
swap(&a,&b);
getch();
}
int swap(int *a,int *b)
{
int swap=*a;
*a=*b;
*b=swap;
printf("\nAfter swapping : %d %d",*a,*b);
return 0;
}