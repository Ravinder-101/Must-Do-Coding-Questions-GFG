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
        profitstocks(arr,n);
        System.out.println();
            t--;
        }


    }
    public static void profitstocks(int arr[],int n){
        int i = 0;
        int fl = 0;
        while(i<n-1){
             int j = i+1;
             if(arr[j] > arr[i]){
                 int k;
                for( k =j;k+1<n;){
                    if(arr[k]< arr[k+1]){
                        k++;
                        
                    }
                    else{
                        break;
                    }
                }
                 System.out.print("("+i+" "+k+")"+" ");
                 fl =1;
                 j=k;
             }
            
          i = j;
            
        }
      if(fl==0){
          System.out.print("No Profit");
      }
        
        
        
        
    }
}
