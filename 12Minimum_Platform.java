import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int dep[] = new int[n];
        for (int i = 0; i < n; i++) {
            dep[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(dep);

        int c_platform = 1;
        int platform_needed = 1;
        int i = 1, j = 0;
        while (i < n && j < n) {
            if (arr[i] > dep[j]) {
                c_platform--;
                j++;
            } else {
                c_platform++;
                i++;
            }

            if (c_platform > platform_needed) {
                platform_needed = c_platform;
            }
        }
        System.out.print(platform_needed + " ");


    }
}
