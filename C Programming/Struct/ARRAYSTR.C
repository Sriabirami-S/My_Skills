#include<stdio.h>
#include<conio.h>
struct student
{
int sub1,sub2,sub3,total;
}s[3];
void main()
{
int i;
struct student s[3]={{1,2,3,0},{1,2,3,0},{1,2,3,0}};
clrscr();
for(i=0;i<3;i++)
  {
  s[i].total=s[i].sub1+s[i].sub2+s[i].sub3;
  }
printf("total marks\n");
for(i=0;i<3;i++)
  {
  printf("student[%d]=%d\n",i+1,s[i].total);
  }
getch();
}
