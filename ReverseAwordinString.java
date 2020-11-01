import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int t= scn.nextInt();
        scn.nextLine();
        while(t>0){
            String str = scn.nextLine();
             reverseWord(str);
            t--;
        }
        
    }
    public static void reverseWord(String str){
        int i =0;
        String res ="";
        while( i<str.length()-1 ){
            int j = i+1;
            while(j<str.length()  && str.charAt(j)!='.' ){
                j++;
            }
           
           if(str.charAt(i) == '.' ||  j < str.length() -1  ){
               res = "."+str.substring(i,j)+res;
           }
           else{
               res = str.substring(i,j)+res;
           }
            i =j+1;
  
        }
        System.out.println(res);
 
    }
}
