#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
void main()
{
FILE *fp1=fopen("file1.txt","r");
FILE *fp2=fopen("file2.txt","r");
FILE *fp3=fopen("file3.txt","w");
char c;
clrscr();
if(fp1==NULL||fp2==NULL||fp3==NULL)
  {
  puts("Error");
  exit(0);
  }
while((c=fgetc(fp1))!=EOF)
fputc(c,fp3);
while((c=fgetc(fp2))!=EOF)
fputc(c,fp3);
printf("Merged file1.txt and file2.txt in file3.txt");
fclose(fp1);
fclose(fp2);
fclose(fp3);
getch();
}