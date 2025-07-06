#include<stdio.h>
#include<conio.h>
int avg(int,int,int,int,int,int);
void main()
{
int m1,m2,m3,m4,m5,m6,average;
clrscr();
m1=99;
m2=89;
m3=80;
m4=100;
m5=97;
m6=90;
average=avg(m1,m2,m3,m4,m5,m6);
printf("The average of six marks=%d",average);
getch();
}
int avg(int m1,int m2,int m3,int m4,int m5,int m6)
{
int z;
z=(m1+m2+m3+m4+m5+m6)/6;
return z;
}
