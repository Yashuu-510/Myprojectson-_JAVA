import java.util.Scanner;
class ArmstrongDemo{
public static void main(String[]args){
int n,digit,sum=0,n1;
Scanner scan=new Scanner(System.in);
System.out.println("enter an interger");
n=scan.nextInt();
n1=n;
while(n!=0)
{
digit=n%10;
sum=sum+(digit*digit*digit);
n=n/10;
}
if(n1==sum)
{
System.out.println("the given integer is an armstrong number");
}
else 
System.out.println("the given integer is not an armstrong number");
}
}
