#include<stdio.h>
#include<conio.h>
void line();
void line()
{
int i;
for(i=0;i<80;i++)
 {
 printf("_");
 }
}
struct employee
{
char name[50];
long sal;
int exp;
};
void main()
{
struct employee e[10];
int i,n;
clrscr();
printf("Enter the no of employees:");
scanf("%d",&n);
for(i=0;i<n;i++)
 {
 printf("Enter the name of the employee %d:",i+1);
 scanf("%s",e[i].name);
 printf("Enter the salary of the employee %d:",i+1);
 scanf("%ld",&e[i].sal);
 printf("Enter the no of years of experience for employee %d:\n",i+1);
 scanf("%d",&e[i].exp);
 if(e[i].exp>=10)
  {
  e[i].sal=e[i].sal+5000;
  }
 else if(e[i].exp>=15)
  {
  e[i].sal=e[i].sal+7000;
  }
 else if(e[i].exp>=5)
  {
  e[i].sal=e[i].sal+1000;
  }
  else
  {
  e[i].sal=e[i].sal+0;
  }
printf("The salary after incrementing:%ld\n\n",e[i].sal);
}
printf("S.NO\t\tNAME\t\tEXPERIENCE\t\tSALARY\n");
line();
for(i=0;i<n;i++)
{
printf("%d\t\t%s\t\t   %d\t\t\t%ld\n",i+1,e[i].name,e[i].exp,e[i].sal);
line();
}
getch();
}



