import java.util.Scanner;
class Fibonacci {
	public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    int n,i,a=0,b=1,c;

    System.out.print("enter size of series:");
       n=scan.nextInt();
   
    System.out.print(a+" ");
    System.out.print(b+" ");

        for(i=3; i<=n; i++)
    {
     c=a+b;
     System.out.print(c+" ");
      a=b;
      b=c;
    }
}
}