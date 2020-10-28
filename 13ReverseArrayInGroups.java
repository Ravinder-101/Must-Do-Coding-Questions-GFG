import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        reverseArray(arr, k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void reverseArray(int arr[], int k) {
        int s = 0;
        int e = arr.length;
        int t = k;
        while (k <= e) {

            reverse(arr, s, k-1);
            s += t;
            k += t;
        }



    }
    public static void reverse(int arr[], int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
    }

}
