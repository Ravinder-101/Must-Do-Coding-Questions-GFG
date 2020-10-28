import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int t =  Integer.parseInt(scn.nextLine());;
        while (t > 0) {
            String str = scn.nextLine();
            Lastindexofone(str);
            t--;
        }

    }
    public static void Lastindexofone(String str){
        int last = -1;
        
        for( int i=0;i<str.length();i++ ){
            if(str.charAt(i)=='1'){
                last=i;
            }
        }
        System.out.println(last);
        
    }
}
