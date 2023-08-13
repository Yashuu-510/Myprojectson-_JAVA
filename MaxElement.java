import java.util.Scanner;

class MaxElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            
        int i, n;
        System.out.println("Enter the size of the array");
        n = scan.nextInt();
        int a[] = new int[n];
        
        int max = a[0];
        
        System.out.println("Enter the array elements");
        for (i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        
        for (i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        
        System.out.println("Maximum element: " + max);
    }
}
