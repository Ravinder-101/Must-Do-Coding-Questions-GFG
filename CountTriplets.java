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
            CountTriplets(arr);

            t--;
        }

    }
    public static void CountTriplets(int arr[]) {
        Arrays.sort(arr);
        int i = arr.length - 1;
        int count = 0;
        while (i >= 0) {
            int j = 0;
            int k = i - 1;

            while (j < k) {
                if (arr[j] + arr[k] == arr[i]) {
                    count++;
                    break;
                } else if (arr[j] + arr[k] < arr[i]) {
                    j++;
                } else {
                    k--;
                }
            }


            i--;
        }
        System.out.print(count);


    }
}
