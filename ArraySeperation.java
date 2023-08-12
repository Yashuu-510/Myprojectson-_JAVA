import java.util.Scanner;
class ArraySeperation{
  public static void main(String[]args){
  Scanner scan = new Scanner(System.in);
  int n,i;
  
  System.out.println("enter the size of an array");
           n=scan.nextInt();
        int a[]=new int[n];
   System.out.println("enter the array elements");
   for (i=0;i<=n-1; i++ )
     {
        a[i]=scan.nextInt();
     }
      System.out.println("even elements are:");

          for(i=0; i<=n-1; i++)
               if(a[i]%2==0)
             { 
                  System.out.print( a[i]+" " );
              } 
      System.out.println();
      System.out.println("odd elements are:");
          for(i=0;i<=n-1; i++)  
            if(a[i]%2!=0)
               {
                 System.out.print(a[i]+" ");
               }
           
    }
  }