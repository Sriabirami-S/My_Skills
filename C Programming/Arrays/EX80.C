#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
char str1[20],str2[20];
int a;
clrscr();
printf("Enter str1:");
scanf("%s",str1);
printf("Enter str2:");
scanf("%s",str2);
a=strcmp(str1,str2);
printf("The value of a:%d",a);
if(a==0)
 {
 printf("\nThe strings are identical");
 }
else
{
printf("\nThe strings are not same");
}
getch();
}
