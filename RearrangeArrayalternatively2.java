import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t > 0) {
            int n = scn.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = scn.nextInt();
            }
            RearrangeArrayAlternatively(arr);

            t--;
        }

    }
    public static void RearrangeArrayAlternatively(int arr[]){
       int mini = 0;
       int maxi = arr.length-1;
       int me = arr[maxi] + 1;
       
       for(int i=0;i<arr.length;i++){
           if(i%2==0){                   //even
               arr[i] = arr[i] + (arr[maxi] % me)*me;
                maxi--;
           }
           else{
               arr[i] = arr[i] + (arr[mini] % me)*me;
            mini++;
              
           }
           
           
       }
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i] %me +" ");
       }
           System.out.println();
            for(int i=0;i<arr.length;i++){
           System.out.print(arr[i] /me +" ");
       }
   
    }
}
