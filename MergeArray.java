import java.util.Scanner;
class MergeArray 
{
	public static void main(String[] args) 
	{
       Scanner scan=new Scanner(System.in);
       int m,n,i,j=0,k=0;
 System.out.print("Enter the size of the array A:");
       m=scan.nextInt();
 System.out.print("Enter the size of the array B:");
       n=scan.nextInt();
    int []a=new int[m];
    int []b=new int[n];
    int []c=new int[m+n];
k=0;
System.out.print("Enter the elements of array A:");
   for(i=0; i<=a.length-1; i++ ,k++)
    {
  a[i]=scan.nextInt();
  c[k]=a[i];
	}
System.out.print("Enter the element of array B:");
for(j=0;j<=n-1;j++,k++)
{
b[j]=scan.nextInt();
c[k]=b[j];
}
System.out.print("merged array is: ");
for(i=0;i<=c.length;i++)
{
System.out.print(c[i]+"  ");
}
}
}

