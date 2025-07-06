#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
char str1[10],str2[10];
clrscr();
printf("Enter first string:");
scanf("%s",str1);
printf("Enter second string:");
scanf("%s",str2);
strcat(str1,str2);
printf("The string is:%s",str1);
getch();
}