import java.util.Scanner;

class anagram1 {
    public static void main(String[] args) {
        String s1;
        String s2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string 1:");
        s1 = scan.nextLine();

        System.out.println("Enter the string 2:");
        s2 = scan.nextLine();

        

        int n1 = s1.length();
        int n2 = s2.length();

        int count1 = 0, count2 = 0;

        if (n1 != n2) {
            System.out.println("They are not anagrams.");
        } else {
            for (int i = 0; i < n1; i++) {
                char x = s1.charAt(i);
                for (int j = 0; j < n2; j++) {
                    if (x == s2.charAt(j)) {
                        count1++;
                        break; // If a match is found, break the inner loop.
                    }
                }
            }

            for (int i = 0; i < n2; i++) {
                char x = s2.charAt(i);
                for (int j = 0; j < n1; j++) {
                    if (x == s1.charAt(j)) {
                        count2++;
                        break; // If a match is found, break the inner loop.
                    }
                }
            }

            if (count1 == n1 && count2 == n2) {
                System.out.println("They are anagrams.");
            } else {
                System.out.println("They are not anagrams.");
            }
        }
    }
}
