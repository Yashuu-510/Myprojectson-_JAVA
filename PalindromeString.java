import java.util.Scanner;
class PalindromeString{
	public static void main(String[] args){ 
Scanner scan=new Scanner(System.in);
String s1;
System.out.println("enter a string");
s1=scan.nextLine();
int i,j,flag;
i=0;
j=s1.length()-1;
flag=1;
while(i<=s1.length()-1){
if(s1.charAt(i)==s1.charAt(j)){
i++;
j--;
}
else{
flag=0;
break;
}
}
if (flag==1){
System.out.println("string is a palindrome");
}
else{
System.out.println("string is not a Palindrome");
}
}
}


	
