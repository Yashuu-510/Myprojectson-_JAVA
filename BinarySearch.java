import java.util.Scanner;
class BinarySearch
{
 public static void main(String[]args){
 Scanner scan=new Scanner(System.in);
    int n,i;
 System.out.println("enter the size of an array:");
       n=scan.nextInt();

int a[]=new int[n];
System.out.println("enter the array element");
{
  for(i=0;i<=a.length-1; i++)
{
   a[i]=scan.nextInt();
}
}

System.out.println("enter the element to be found:");
       int x=scan.nextInt();
 i=0;
 int j=a.length-1;
 int mid=0; 
 int found=0;


      while(i<=j)
          {
             mid=(i+j)/2;
             //case 1
           if(x==a[mid])
              {
                 found=1;
                 break;
              }
            
			 //case 2
          else if(x>a[mid])
             {
                i=mid+1;
             }
            //case 3
          else
            {
              j=j-1;
            }
         }//while loop
    if(found==0)
  {
     System.out.println("element not found");
  }
    else
  {
      System.out.println("element found");
  }

}
}