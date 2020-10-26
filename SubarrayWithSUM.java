import java.util.*;

public class Main{

public static void main(String[] args) {

Scanner scn = new Scanner(System.in);
int t = scn.nextInt();
while(t>0){
    int n = scn.nextInt();
    int sum = scn.nextInt();
    int arr[] = new int[n];
    
    for(int i = 0;i<n;i++){
        arr[i] = scn.nextInt();
    }
    subarraySum(arr,sum);

    t--;
}

 }
 public static void subarraySum(int arr[] , int sum){
     int curr_sum = 0;
     int start =0;
     int end= - 1;
     HashMap<Integer,Integer> hm = new HashMap<>();
     
     for(int i=0;i<arr.length;i++){
         curr_sum =curr_sum +arr[i];
         if(curr_sum == sum){
             start = 0;
             end = i;
             break;
             
         }
         if(hm.containsKey( curr_sum - sum ) ){
             start = hm.get(curr_sum - sum) + 1 ;
             end = i;
             break;
             
         }
         hm.put(curr_sum,i);
     }
     if(end == -1){
         System.out.println("No subarray");
     }
     else{
         System.out.println((start+1)+" "+(end+1) );
     }
     
     
     
     
 }
}
