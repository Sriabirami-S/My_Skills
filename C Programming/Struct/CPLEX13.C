#include<stdio.h>
#include<conio.h>
struct employee
{
int id;
char name;
long sal;
}emp[2];
void main()
{
int i;
long max=0;
clrscr();
for(i=0;i<3;i++)
{
printf("Enter empid:");
scanf("%d",&emp[i].id);
printf("Enter name:");
scanf("%s",emp[i].name);
printf("Enter salary:");
scanf("%ld",&emp[i].sal);
printf("_____________________\n");
}
max=emp[0].sal;
for(i=1;i<3;i++)
{
if(emp[i].sal>max)
 {
 max=emp[i].sal;
 }
}
printf("Maximum salary=%ld",max);
getch();
}
