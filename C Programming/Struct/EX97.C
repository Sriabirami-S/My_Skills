#include<stdio.h>
#include<conio.h>
#include<string.h>
struct fruits
{
char name[50];
int pkg;//price per kg
int cp;//cost price
int sp;//selling price
int pro;//profit
}f[10];
void main()
{
int i,n,tsp,tpro,max,j;//tsp-total selling price;tpro-total profit
char x[100];
clrscr();
tsp=0;
tpro=0;
printf("Enter the no of fruits:");
scanf("%d",&n);
for(i=0;i<n;i++)
 {
 printf("Enter fruit name %d:",i+1);
 scanf("%s",f[i].name);
 printf("Enter the price/kg of fruit %d:",i+1);
 scanf("%d",&f[i].pkg);
 printf("Enter the cost price of fruit %d:",i+1);
 scanf("%d",&f[i].cp);
 printf("Enter the selling price of fruit %d:",i+1);
 scanf("%d",&f[i].sp);
 f[i].pro=f[i].sp-f[i].cp;
 printf("The profit for fruit %d:%d\n",i+1,f[i].pro);
 tsp=tsp+f[i].sp;
 tpro=tpro+f[i].pro;
 printf("The total selling price:%d\n",tsp);
 printf("The total profit:%d\n",tpro);
 }
printf("Fruits in the order of decreasing profit:\n");
for(i=0;i<n;i++)
 {
 for(j=i+1;j<n;j++)
  {
  if(f[i].pro<f[j].pro)
   {
   strcpy(x,f[i].name);
   strcpy(f[i].name,f[j].name);
   strcpy(f[j].name,x);
   }
  }
  printf("%s\n",f[i].name);
 }
getch();
}


