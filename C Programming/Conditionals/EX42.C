#include<stdio.h>
#include<conio.h>
void main()
{
char ch;
clrscr();
printf("Enter the class of ticket:");
ch=getchar();
switch(ch)
  {
  case 'A':
  case 'a':
    printf("The price of the ticket is Rs.200/-");
    break;
  case 'B':
  case 'b':
    printf("The price of the ticket is Rs.150/-");
    break;
  case 'C':
  case 'c':
    printf("The price of the ticket is Rs.100/-");
    break;
  case 'D':
  case 'd':
    printf("The price of the ticket is Rs.50/-");
    break;
  default:
    printf("Enter alphabets only from a to d");
    break;
  }
getch();
}



