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
struct student
{
char name[50],g[10];
int m[5];
int tot;
int avg;
}s[20];
void main()
{
int i,j,n;
clrscr();
printf("Enter the no of students:");
scanf("%d",&n);
for(i=0;i<n;i++)
 {
 printf("Enter the name of student %d:",i+1);
 scanf("%s",s[i].name);
 printf("Enter marks of student %d:\n",i+1);
	for(j=0;j<5;j++)
	 {
	 scanf("%d",&s[i].m[j]);
	 s[i].tot=s[i].tot+s[i].m[j];
	 }
 s[i].avg=s[i].tot/5;
     if(s[i].avg>=90)
       s[i].g[i]='O';
     else if((s[i].avg<=89)&&(s[i].avg>70))
       s[i].g[i]='A';
     else if((s[i].avg<=69)&&(s[i].avg>60))
       s[i].g[i]='B';
     else if((s[i].avg<=59)&&(s[i].avg>50))
       s[i].g[i]='C';
     else
       s[i].g[i]='F';
 }
printf("ROLL NO\t\tNAME\t\tTOTAL\t\tAVERAGE\t\tGRADE\n");
line();
for(i=0;i<n;i++)
 {
  printf("  %d\t\t%s\t\t %d\t\t  %d\t\t  %c\n",i+1,s[i].name,s[i].tot,s[i].avg,s[i].g[i]);
  line();
 }
getch();
}

