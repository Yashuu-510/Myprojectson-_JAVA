import java.util.Scanner;

class penultimate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        char[] a = scan.nextLine().toCharArray();
        int n = 0;
        for(char i:a) { n++; }
        int count = 0;
        n--;

        while (n >= 0) {
            if (a[n] == ' ') {
                count++;
                if (count == 2) {
                    break;
                }
            }
            n--;
        }

        if (count == 0) {
            System.out.println("Last 2nd word not found.");
        } else {
            n++;
            while (n < a.length && a[n] != ' ') {
                System.out.print(a[n]);
                n++;
            }
        }
    }
}
