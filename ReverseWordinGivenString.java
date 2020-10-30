import java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        while (n > 0) {
            String str = scn.nextLine();
            String ans = "";

            int i = str.length() - 1;
            while (i >= 0) {
                while (i >= 0 && str.charAt(i) == ' ') {
                    i--;
                }
                int j = i;
                while (i >= 0 && str.charAt(i) != ' ') {
                    i--;
                   
                }
                 
                ans = ans  + str.substring(i+1 , j+1 )+" " ;

            }
            System.out.println(ans);
            n--;
        }



    }
}
