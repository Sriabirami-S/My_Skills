#include<stdio.h>
#include<conio.h>
void main()
{
char str[20],*p;
clrscr();
printf("Enter a word:");
gets(str);
p=str;
printf("The entered word is ");
while(*p!='\0')
 {
 printf("%c",*p++);
 }
getch();
}
