import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t>0){
            int n = scn.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = scn.nextInt();
            }
            tappingRainWater(arr);
            t--;
        }

    }
    public static void tappingRainWater(int arr[]){
        
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        int maxl = 0;
        for(int i=0;i<arr.length;i++){
            
            if(maxl >= arr[i] ){
                left[i] = maxl;
            }else{
                left[i] = arr[i];
                maxl = left[i];
            }
        }
        int maxr =0;
        for(int i=arr.length-1;i>=0;i--){
            if(maxr >= arr[i] ){
                right[i] = maxr;
            }else{
                right[i] = arr[i];
                maxr = right[i];
            }
        }
        int area =0 ;
        for(int i=0;i<arr.length;i++){
            area = area + Math.min(left[i],right[i] ) - arr[i]; 
        }
        System.out.println(area);
        
    }
    
}
