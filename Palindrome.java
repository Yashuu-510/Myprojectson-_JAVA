import java.util.Scanner;
class Palindrome{
   public static void main(String[] args){
int n,rev,digit,n1;
Scanner scan=new Scanner(System.in);
System.out.println("enter an integer");
n=scan.nextInt();
rev=0;n1=n;
while(n!=0)
{
digit=n%10;
rev=rev*10+digit;
n=n/10;
}
if(rev==n1){
System.out.print("It is a Palindrome");
}
else{
System.out.print("It is not an palindrome");
}
}
}


