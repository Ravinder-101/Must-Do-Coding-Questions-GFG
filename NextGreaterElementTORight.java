import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        
        int t = scn.nextInt();
        while(t>0){
            int n = scn.nextInt();
            int arr[] = new int[n];
            for( int i=0 ; i<n ; i++ ){
                arr[i] = scn.nextInt();
            }
            
            int nge[] = nextgreaterele(arr);
            for(int i=0;i<n;i++){
                System.out.print(nge[i]+" ");
            }
            System.out.println();
            
            t--;
        }

    }
    public static int[] nextgreaterele(int arr[]){
        
        Stack<Integer> st = new Stack<>();
        int nge[] = new int[arr.length];
        nge[arr.length-1] = -1;
        st.push(arr[arr.length-1]);
        
        for(int i=arr.length-2;i>=0;i--){
            
            while( st.size() > 0 && st.peek() < arr[i] ){
                st.pop();
            }
            if(st.size() > 0 ){
                nge[i] = st.peek();
            }
            else{
                nge[i]= -1;
            }
            st.push(arr[i]);
        }
        return nge;
    }
}
