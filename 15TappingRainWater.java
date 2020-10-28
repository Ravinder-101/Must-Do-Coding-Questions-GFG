import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        
        for( int i=0 ; i<n ; i++ ){
            arr[i] = scn.nextInt();
        }
        int left[] = new int[n];
        left[0]= arr[0];
        int ml = left[0];
        for(int i=1;i<n;i++){
            if(arr[i] > ml ){
                left[i] = arr[i];
                ml = arr[i];
            }else{
                left[i]= ml;
            }
        }
        int right[] = new int[n];
        right[n-1] = arr[n-1];
        int mr = left[n-1];
        for(int i=n-1;i>=0;i--){
            if(arr[i] > mr ){
             right[i] = arr[i];
                mr = arr[i];
            }else{
                right[i]= mr;
            }
        }
        int water = 0;
        for( int i = 0 ; i<n ; i++ ){
            water = water + (Math.min(left[i],right[i] ) - arr[i]); 
        } 
        System.out.print(water);


    }
}
