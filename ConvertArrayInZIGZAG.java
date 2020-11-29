import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    
    for(int i=0;i<n;i++){
        arr[i] = scn.nextInt();
    }
    
    zigzag(arr);
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+ " ");
    }
 }
 public static void tappingWater(int arr[]){
     int n = arr.length;
     
     int larr[] = new int[n];
     int rarr[] = new int[n];
     
     
     larr[0] = arr[0];
     int max = larr[0];
     
     for(int i=1;i<n;i++){
         if(arr[i]<max){
             larr[i]=max;
         }
         else{
             larr[i] = arr[i];
             max = arr[i];
         }
     }
     
     rarr[n-1] = arr[n-1];
     int maxr = rarr[n-1];
     for(int i=n-2;i>=0;i--){
         
          if(arr[i]<maxr){
             rarr[i]=maxr;
         }
         else{
             rarr[i] = arr[i];
             maxr = arr[i];
         }
         
     }
     int waterinside = 0;
     for(int i=0;i<n;i++){
         int m = Math.min(larr[i],rarr[i] );
         m = m - arr[i];
         waterinside = waterinside + m;
     }
     System.out.print(waterinside);
     
 }
 
 public static void zigzag(int arr[]){
     
     int n = arr.length;
     boolean flag = true;
     for(int i=0;i<n-2;i++){
         if(flag){
             if(arr[i]>arr[i+1]){
                 int temp = arr[i];
                 arr[i] = arr[i+1];
                 arr[i+1]= temp;
             }
             
         }
         else{
               if(arr[i]<arr[i+1]){
                 int temp = arr[i];
                 arr[i] = arr[i+1];
                 arr[i+1]= temp;
             }
             
             
         }
         flag=!flag;
         
     }
     
 }
}
