#include<stdio.h>
#include<conio.h>
struct veg
{
char name[20];
int wt;
int price;
}v;
void main()
{
clrscr();
printf("Enter vegetable name:");
scanf("%s",v.name);
printf("Enter the price:");
scanf("%d",&v.price);
printf("Enter the weight of the vegetable:");
scanf("%d",&v.wt);
printf("\nThe name of the vegetable:%s\nWeight:%d\nPrice:%d",v.name,v.wt,v.price);
getch();
}