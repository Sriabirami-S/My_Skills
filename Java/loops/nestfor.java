class nestfor{
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=3;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}