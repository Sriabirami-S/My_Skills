public class fnpar{
   /* public static void main(String args[])
    {
        store obj=new store();
        obj.getchocolate(5);
        obj.getpowder(25);
    }
    void getchocolate(int price)//int price will be present only within this function
    {
        System.out.println("chocolate purchased");
        System.out.println("cost of chocolate ="+price);
        System.out.println();
    }
    void getpowder(int price)
    {
        System.out.println("powder purchased");
        System.out.print("cost of the powder="+price);
    }*/
  
   void sum(int a,int b)
   {
    System.out.println("sum="+(a+b));
   }
   void sub(int a,int b)
   {
    System.out.println("difference="+(a-b));
   }
   void prod(int a,int b)
   {
    System.out.println("product="+(a*b));
   }
   void div(float a,float b)
   {
     System.out.println(a);
    System.out.println("quotient="+(a/b));
   }
   public static void main(String args[])
   {
    fnpar obj=new fnpar();
    obj.sum(5,10);
    obj.sub(5,10);
    obj.prod(5,10);
    obj.div(5.12f,10.12f);
   }
   
    
}