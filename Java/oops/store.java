public class store{
    /*int sum(int a,int b)
    {
        
       return a+b;
    }
    public static void main(String args[])
    {
        store obj=new store();
        int sum=obj.sum(30,1);
        System.out.print(sum);
    }*/
   String getname()
   {
    return "abi";
   }
   String getphone()
   {
    return "9361275297";
   }
   public static void main(String args[])
   {
    store obj=new store();
   System.out.println(obj.getname());
    String no=obj.getphone();
   
    System.out.print(no);
   }


}