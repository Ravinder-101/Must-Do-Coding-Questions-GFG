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
            KadenceAlgorithm(arr);

            t--;
        }


    }
    public static void KadenceAlgorithm(int arr[]) {
        int osum = arr[0];
        int csum  = arr[0];
        for(int i=1;i<arr.length;i++){
        csum = csum + arr[i];
        if(csum < arr[i]){
            csum = arr[i];
        }
        if(csum >osum ){
            osum = csum;
        }
        }
      
      System.out.println(osum);


    }
}
