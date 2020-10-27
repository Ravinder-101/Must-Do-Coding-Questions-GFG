import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

      int n = scn.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++){
          arr[i]= scn.nextInt();
      }
      int m = scn.nextInt();
      int brr[] = new int[m];
      for(int i=0;i<m;i++){
          brr[i]= scn.nextInt();
      }
      
      for(int i=0;i<n;i++){
          if(arr[i] > brr[0] ){
              int temp = arr[i];
              arr[i] = brr[0];
              brr[0]= temp;
              Arrays.sort(brr);
          }
      }
      
      for(int i=0;i<n;i++){
          System.out.print(arr[i]+" ");
      }
      System.out.println();
      for(int i=0;i<m;i++){
           System.out.print(brr[i]+" ");
        
      }

    }
   
}
