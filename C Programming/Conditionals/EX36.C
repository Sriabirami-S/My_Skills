#include<stdio.h>
#include<conio.h>
void main()
{
char character;
clrscr();
printf("Are you coming with me?\nType Y for yes and N for no:");
character=getchar();
if(character=='Y')
{
printf("Yes I am coming with you");
}
else if(character=='N')
{
printf("Let us go later");
}
else
{
printf("Type either Y or N");
}
getch();
}