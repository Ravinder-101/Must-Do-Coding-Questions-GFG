import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t > 0) {
            int n = scn.nextInt();
            int k = scn.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            reverse(arr, n, k);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            t--;
        }


    }
    public static void reverse(int arr[], int n, int k) {

        for (int i = 0; i < n; i += k) {

            int left = i;

            int right = Math.min(i + k - 1, n - 1);

            swap(arr, left, right);

        }

    }
    public static void swap(int arr[], int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
