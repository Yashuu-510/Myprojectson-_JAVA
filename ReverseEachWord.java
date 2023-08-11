import java.util.Scanner;
import java.util.StringTokenizer;
class ReverseEachWord{
public static void main(String []args){
Scanner scan=new Scanner(System.in);
String s1;
System.out.println("enter an statement");
s1=scan.nextLine();
StringToken stk=new StringTokenizer(s1, " " );
while(stk.hasMoreToken==true)
{
String Token=stk.nextToken();
int len=Token.length();
for(i=len-1;i>=0;i--)
{
System.out.print(Token.charAt(i));
}
System.out.print();
}
}
}
