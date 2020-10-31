import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t > 0) {
            int n = scn.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            int m = scn.nextInt();
            chocolateDis(arr, n, m);
            t--;
        }


    }
    public static void chocolateDis(int arr[], int n, int m) {
        Arrays.sort(arr);
        int i = 0;
        int j = i + m - 1;
        int min = Integer.MAX_VALUE;
        while (j < n) {
            int diff = arr[j] - arr[i];
            min = Math.min(diff, min);

            j++;
            i++;

        }
        System.out.println(min);

    }
}
