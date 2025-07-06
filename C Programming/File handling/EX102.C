#include<stdio.h>
#include<conio.h>
void main()
{
FILE *fp1;
fp1=fopen("cha","w");
char c='a',t;
putc(c,fp1);
fclose(fp1);
fp1=fopen("cha","r");
t=getc(fp1);
printf("%c",t);
getch();
}
