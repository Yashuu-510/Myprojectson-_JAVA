import java.util.Scanner;

class panagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        char[] a = scan.nextLine().toCharArray();
        int count = 0;
        for (int i = 97, k = 65; i <= 122 && k <= 90; i++, k++) {
            for (char j : a) {
                if (i == j || k == j) {
                    count++;
                    break;
                }
            }
        }

        if (count == 26) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }
}
