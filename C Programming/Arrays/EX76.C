#include<stdio.h>
#include<conio.h>
void line(void);
void main()
{
int m[6],a,tot,avg;
clrscr();
tot=0;
avg=0;
printf("Enter the marks:\n");
for(a=0;a<5;a++)
 {
 scanf("%d",&m[a]);
 tot=tot+m[a];
 }
avg=tot/5;
line();
printf("\t\t\t\t  MARK LIST\n");
line();
printf("\tSubject\t\t\t\t\t\t\t\tMark\n");
line();
printf("\tTamil\t\t\t\t\t\t\t\t%d\n",m[0]);
line();
printf("\tEnglish\t\t\t\t\t\t\t\t%d\n",m[1]);
line();
printf("\tMaths\t\t\t\t\t\t\t\t%d\n",m[2]);
line();
printf("\tScience\t\t\t\t\t\t\t\t%d\n",m[3]);
line();
printf("\tSocial\t\t\t\t\t\t\t\t%d\n",m[4]);
line();
printf("\t\t\t\t\t\t\t\tTotal = %d\n",tot);
line();
printf("\t\t\t\t\t\t\t\tAverage = %d\n",avg);
line();
getch();
}
void line(void)
{
int i;
for(i=0;i<80;i++)
  {
  printf("_");
  }
}
