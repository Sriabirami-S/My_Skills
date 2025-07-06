//average and total
#include<stdio.h>
#include<conio.h>
void main()
{
int tamil,english,maths,science,social,total,average;
clrscr();
printf("Enter the tamil mark:");
scanf("%d",&tamil);
printf("Enter the value of english mark:");
scanf("%d",&english);
printf("Enter the value of maths mark:");
scanf("%d",&maths);
printf("Enter the value of science mark:");
scanf("%d",&science);
printf("Enter the value of social mark:");
scanf("%d",&social);
total=tamil+english+maths+science+social;
average=total/5;
printf("\nThe total of five subjects=%d",total);
printf("\nThe average of five subjects=%d",average);
getch();
}
