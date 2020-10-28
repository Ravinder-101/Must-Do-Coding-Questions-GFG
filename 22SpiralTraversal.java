import java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t > 0) {
            int n = scn.nextInt();
            int m = scn.nextInt();
            int arr[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = scn.nextInt();
                }
            }
            spiraltraversal(arr);
            System.out.println();
            t--;
        }


    }
    public static void spiraltraversal(int arr[][]) {
        int n = arr.length;

        int m = arr[0].length;


        int minr = 0;
        int minc = 0;
        int maxr = arr.length;
        int maxc = arr[0].length;
        int count = 0;

        while (count < n * m) {

            // top
            for (int i = minc, j = minr; i < maxc && count < n * m; i++) {
                System.out.print(arr[j][i] + " ");
                count++;
            }
            minr++; // minrow == 1;

            // right
            for (int i = minr; i < maxr && count < n * m; i++) {
                System.out.print(arr[i][maxc - 1] + " ");
                count++;
            }

            maxc--; //maxcolumn = 3;

            // bottom
            for (int i = maxc - 1; i >= minc && count < n * m; i--) {
                System.out.print(arr[maxr - 1][i] + " ");
                count++;
            }

            maxr--; //maxrow = 3

            // left
            for (int i = maxr - 1, j = minc; i >= minr && count < n * m; i--) {
                System.out.print(arr[i][j] + " ");
                count++;
            }

            minc++;
        }
    }
}
