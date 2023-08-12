import java.util.Scanner;
 class RemoveElement{
    public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    int i,j=0,x,n;
    System.out.print("enter the size of an array");
          n=scan.nextInt();
    int a[]=new int[n];
    int b[]=new int[n-1];
   System.out.print("enter an array element");
     for(i=0; i<n; i++)
         {
            a[i]=scan.nextInt();
         }
   System.out.println("enter the element to be removed");
          x=scan.nextInt();
    for(i=0; i<n; i++)
     if(a[i]!=x)
       {
         b[j]=a[i];
         j++;
       }
     for( j=0; j<n-1; j++)
       {
         System.out.print(b[j]+" ");
       }
  }
 }