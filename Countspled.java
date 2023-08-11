import java.util.Scanner;
class Countspled{
	public static void main(String[] args){
		System.out.println("Enter a String");
        Scanner scan=new Scanner(System.in);
      char [] a=scan.nextLine().toCharArray();
      int sp=0, le=0,d=0;
      for(char i:a)
           {
                if(i==' ')
                      {
                       sp++;
                      }
              if((i>=65 && i<=90) || (i>=97 && i<=122))
                     {
                        le++;
                     }
              if(i>=48 && i<=57)
                     {
                        d++;
                     }
             }
        System.out.println("words:" +sp);
        System.out.println("letters:" +le);
        System.out.println("digit:"+d);

	}
}
