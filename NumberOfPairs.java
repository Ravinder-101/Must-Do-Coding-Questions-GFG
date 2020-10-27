import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x[] = new int[n];
        for(int i =0;i<n;i++){
            x[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int y[]=new int[m];
        for(int i=0;i<m;i++){
            y[i] = scn.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if( Math.pow(x[i],y[j]) > Math.pow(y[j],x[i])  ){
                    count++;
                }
            }
        }
        System.out.print(count);


    }
}
