import java.util.Scanner;
class BubbleSort{
	public static void main(String[] args){
   Scanner scan=new Scanner(System.in);
           int n,i,x,j=0;
System.out.println("enter the size of the array:");
   n=scan.nextInt();
int a[]=new int[n];
System.out.println("enter an elements of array");
for(i=0; i<=a.length-1;i++)
 {
    a[i]=scan.nextInt();
 }
System.out.println("enter the nth element to be find");
      x=scan.nextInt();
for(i=1;i<=a.length-1;i++)
{
for(j=0;j<=a.length-2;j++)
{
    if(a[j]>a[j+1])
{
   a[j]=a[j]+a[j+1];
   a[j+1]=a[j]-a[j-1];
   a[j]=a[j]-a[j-1];
}
}
}
System.out.println("the nth max element is:"+a(a.length-x));
  }
}
