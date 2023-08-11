import java.util.Scanner;

class commanElement {
    public static void main(String[] args) {
        int i, j, k;
        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[4];

        System.out.print("Enter the elements of A: ");
        for (i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }

        System.out.print("Enter the elements of B: ");
        for (j = 0; j <= b.length - 1; j++) {
            b[j] = scan.nextInt();
        }

        System.out.print("Enter the elements of C: ");
        for (k = 0; k <= c.length - 1; k++) {
            c[k] = scan.nextInt();
        }

        System.out.println("Common elements in A, B, and C:");
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < b.length; j++) {
                for (k = 0; k < c.length; k++) {
                    if (a[i] == b[j] && b[j] == c[k]) {
                        System.out.println(a[i]);
                    }
                }
            }
        }
    }
}

                             
