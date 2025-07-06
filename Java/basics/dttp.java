class dttp
{
    public static void main(String args[])
    {
        int a=10;
        float b=34.53456789f;//when we use without f at end we get" possible lossy conversion from double to float" 
        double c=2.567893; 
        System.out.println("int= "+a);//we cannot print two variables at the same time "System.out.print(a,b);"
        System.out.println("float= "+b);
        System.out.println("double= "+c);
        char d='*';
        String name = "abi";
        System.out.println("cahracter from string= "+name.charAt(2));/*note the way of declaration__we may get error when we use the no withib () greater than the string size; So we get the error as "String index out of range"*/
        System.out.println("char= "+d);
        boolean e=true;
        boolean f=false;
        System.out.println("boolean = "+e);
        System.out.println("boolean = "+f);

    }
}