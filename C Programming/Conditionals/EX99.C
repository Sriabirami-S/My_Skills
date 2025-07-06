#include<stdio.h>
#include<conio.h>
void main()
{
char a;
clrscr();
printf("Enter a letter:");
scanf("%c",&a);
printf("The entered letter is ");
switch(a)
 {
 case 'a':
  printf("vowel");
  break;
 case 'e':
  printf("vowel");
  break;
 case 'i':
  printf("vowel");
  break;
 case 'o':
  printf("vowel");
  break;
 case 'u':
  printf("vowel");
  break;
 default:
  printf("consonant");
  break;
}
getch();
}