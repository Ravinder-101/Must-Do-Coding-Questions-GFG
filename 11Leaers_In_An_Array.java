import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int max = arr[n-1];
        System.out.print(arr[n-1] +" ");
        for(int i=n-2;i>=0;i--){
            if(arr[i] > max){
                System.out.print(arr[i]+" ");
                max = arr[i];
            }
        }

    }
}
