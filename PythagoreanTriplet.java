import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for( int i=0 ; i<n ; i++ ){
            arr[i] = scn.nextInt();
        }
        System.out.print(pythagoreanTriplet(arr,n));

    }
    public static boolean pythagoreanTriplet(int arr[] , int n){
        for(int i=0;i<n;i++){
            arr[i]= arr[i]*arr[i];
        }
        Arrays.sort(arr);  // O(nlogn)
        
        for(int i=n-1;i>=2;i--){
            int l =0;
            int r =i-1;
            
            while(l<r){
                if(arr[l] + arr[r] == arr[i]){
                    return true;
                }
                else if(arr[l] + arr[r] > arr[i]){
                    r--;
                }
                else{
                    l++;
                }
                
            }
        }
        return false;
    }
}
