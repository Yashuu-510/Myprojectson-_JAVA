import java.util.Scanner;

class LInearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, n, x, count = 0;
        
        System.out.println("Enter the size of the array");
        n = scan.nextInt();
        int a[] = new int[n];
        
        for (i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        
        System.out.println("Enter the element to be searched");
        x = scan.nextInt();
        
        for (i = 0; i < n; i++) {
            if (a[i] == x) {
                System.out.println("Element found");
                count++;
                break;
            }
        }
        
        if (count == 0) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found " + count + " times");
        }
    }
}
