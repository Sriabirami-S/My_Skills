class variables{
    public static void main(String args[])
    {
        int container = 20;
        
        String john = "\nABI";  //now we get a error saying 'variable container is already defined'.So we cannot use same variable name in a code more than once
        String container2 = john;
        System.out.print(container);
        System.out.print(container2);
    }
}

