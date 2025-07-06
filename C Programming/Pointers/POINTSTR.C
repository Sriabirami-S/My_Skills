#include<stdio.h>
#include<conio.h>
void main()
{
struct
  {
  int r;
  char name;
  }*stud;
printf("Enter roll no:");
scanf("%d",&stud->r);
printf("Enter name:");
scanf("%s",stud->name);
printf("roll no=%d\nname=%s",stud->r,stud->name);
getch();
}