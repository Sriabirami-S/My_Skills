#include<stdio.h>
#include<conio.h>
#include<ctype.h>
void main()
{
char ch;
clrscr();
printf("Enter a character:");
ch=getchar();
if(isupper(ch)>0)
  {
 ch=tolower(ch);
  printf("%c",ch);
  }
else if(islower(ch)>0)
  {
 ch=toupper(ch);
  printf("%c",ch);
  }
else
  {
  printf("Enter an alphabet");
  }
getch();
}
