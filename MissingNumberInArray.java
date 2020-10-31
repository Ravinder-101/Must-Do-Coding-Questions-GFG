import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        
        int t= scn.nextInt();
        while(t>0){
            
            int n = scn.nextInt();
        int arr[] = new int[n];
        for( int i = 0;i<n-1;i++ ){
            arr[i] =scn.nextInt();
        }
        int x1 = arr[0];
        int x2 = 0;
        for(int i=1;i<n-1;i++){
            x1 =x1^arr[i];
        }
        for(int i=1;i<=n;i++){
            x2 = x2^i;
        }
        System.out.println(x2^x1);
            
            
            t--;
        }
        

    }
}
