#include<stdio.h>
#include<conio.h>
void main()
{
FILE *fp1;
int i,num;
clrscr();
fp1=fopen("file","w");
printf("Enter a number: ");
for(i=1;i<=5;i++)
 {
 scanf("%d",&num);
 putw(num,fp1);
 }
fclose(fp1);
fp1=fopen("file","r");
while((num=getw(fp1))!=EOF)
 {
 printf("%d ",num);
 }
fclose(fp1);
getch();
}