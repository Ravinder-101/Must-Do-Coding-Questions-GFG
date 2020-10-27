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
        int s = 0;
        int e = arr.length-1;
        int brr[] = new int[arr.length];
        int i=0;
        
       while(s<e){
        brr[i]=arr[e];
        i++;
        brr[i]= arr[s];
        s++;
        e--;
        i++;
       }
       if(arr.length % 2!=0){
           brr[i] = arr[e];  
       }
       for(int j=0;j<arr.length;j++){
           
           System.out.print(brr[j]+" ");
       }
           
       
        
    }
}
