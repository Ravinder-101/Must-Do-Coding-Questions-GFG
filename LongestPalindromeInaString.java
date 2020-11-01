import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        scn.nextLine();
        while (t > 0) {
            String str = scn.nextLine();
            longestpalindromic(str);
            t--;
        }

    }
    public static void printSubStr(String str, int low, int high) {
        System.out.println(str.substring(low, high + 1));
    }


    public static void longestpalindromic(String str) {

        int n = str.length();
        boolean table[][] = new boolean[n][n];

        //All substring of length 1 are plaindrome
        int maxlength = 1;
        for (int i = 0; i < n; i++) {
            table[i][i] = true;
        }
        //check for length of 2 substring plindrome or not
        int start = 0;
        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxlength = 2;
            }
        }

        //check for length greater than 2
        // k is the length of the string
        for (int k = 3; k <= n; k++) {

            //fix the starting position
            for (int i = 0; i < n - k + 1; i++) {

                int j = i + k - 1;
                if (table[i + 1][j - 1] &&
                    str.charAt(i) == str.charAt(j)) {
                    table[i][j] = true;

                    if (k > maxlength) {
                        start = i;
                        maxlength = k;
                    }
                }
            }

        }
        printSubStr(str, start, start + maxlength - 1);


    }
}
