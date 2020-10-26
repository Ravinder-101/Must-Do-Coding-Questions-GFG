import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        while (t > 0) {
            int n = scn.nextInt();
            
            HashSet<Integer> hs = new HashSet<>();
            
            for (int i = 0; i < n-1; i++) {
                int s = scn.nextInt();
                hs.add(s);
            }
            MissingNumber(n,hs);

            t--;
        }


    }
    public static void MissingNumber(int n, HashSet<Integer> hs) {
        for(int i=1;i<n;i++){
            if(hs.contains(i)){
                
            }
            else{
                System.out.println(i);
                break;
            }
        }


    }
}
