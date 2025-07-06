#include<stdio.h>
#include<conio.h>
void main()
{
int num,r1,r2,rev1,rev2;
clrscr();
rev1=0;
rev2=0;
printf("Enter a number:");
scanf("%d",&num);
while(num!=0)
 {
 r1=num%10;
 rev1=(rev1*10)+r1;
 num=num/10;
 }
printf("the reversed number : %d",rev1);
printf("\nThe digits name ");
while(rev1!=0)
 {
 r2=rev1%10;
 rev2=(rev2*10)+r2;
 rev1=rev1/10;
  switch(r2)
   {
   case 1:
    printf("one ");
    break;
   case 2:
    printf("two ");
    break;
   case 3:
    printf("three ");
    break;
   case 4:
    printf("four ");
    break;
   case 5:
    printf("five ");
    break;
   case 6:
    printf("six ");
    break;
   case 7:
    printf("seven ");
    break;
   case 8:
    printf("eight ");
    break;
   case 9:
    printf("nine ");
    break;
   default:
    printf("zero ");
    break;
   }
  }
  getch();
 }
