import java.util.Scanner;

class InsertWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String1");
        char[] s1 = scan.nextLine().toCharArray();
        System.out.println("Enter the index value");
        int x = scan.nextInt();
        System.out.println("Enter the String2");
        char[] s2 = scan.nextLine().toCharArray();

        int m, n;
        m = 0;
        n = 0;
        for (char i : s1) {
            m++;
        }
        for (char j : s2) {
            n++;
        }
        int k = m + n;
        char[] s3 = new char[m + n];

        for (int i = 0; i <= x - 1; i++) {
            s3[k] = s1[i];
            k++;
        }
        for (int j = 0; j < n; j++) {
            s3[k] = s2[j];
            k++;
        }
        for (int i = x; i < m; i++) {
            s3[k] = s1[i];
            k++;
        }

        System.out.println("The new inserted string:");
        for (k = 0; k < (m + n); k++) {
            System.out.print(s3[k]);
        }
    }
}
