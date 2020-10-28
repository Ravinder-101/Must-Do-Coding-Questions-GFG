import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner  scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0  ; i<n ; i++){
            arr[i] = scn.nextInt();
        }
        int l =0 ;
        int m = 0;
        int h = n-1;
        while(m<h){
            if(arr[m] == 0){
                swap(arr,l,m);
                l++;
                m++;
                gu
            }
            if(arr[m] == 1){
                m++;
            }
            if(arr[m] == 2){
                swap(arr,m,h);
                h--;
            }
        }
        for( int i=0 ; i<n ; i++ ){
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int arr[] , int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
