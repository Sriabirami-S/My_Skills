package KK_Java;
import java.util.Scanner;

public class v3_UpperOrLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("enter a word");
String s = new String();
//char s = scan.next().charAt(3);
s=scan.next();

System.out.println("enter the no of letters:");
int n = scan.nextInt();
for(int i=0;i<n;i++)
{
char c = s.charAt(i);
System.out.println("letter considered: "+c);
if(c>='a' && c<='z')
{
	System.out.println("Type:lowercase");
}
else
{
	System.out.println("Type:uppercase");
}
System.out.println();
}
	}

}
