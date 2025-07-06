import java.util.Scanner;
class cc25{
    public static void main(String args[])
    {
        System.out.print("What is the score in a game?");
        Scanner scan=new Scanner(System.in);
        double score=scan.nextDouble();
        if(score<50)
        {
            System.out.println("You need to improve");

        }
        else if((score>=50)&&(score<=70))//else if(score==50 || score>50 && score<70)
        {
            System.out.println("good job!");
        }
        else if(score>70)
        {
            System.out.print("Excellent job!");
        }
    }
}