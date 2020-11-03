import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int  n = scn.nextInt();
        scn.nextLine();
        while(n>0){
            String str = scn.nextLine();
            ParenthesesCheck(str);
            n--;
        }
    
    }
    public static void ParenthesesCheck(String str){
        
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++ ){
            char ch = str.charAt(i);
            
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else if(ch==')'){
                if(st.size()>0 && st.peek() =='(' ){
                    st.pop();
                }
                else{
                    System.out.println("not balanced");
                    return;
                }
                  
            }
            else if(ch=='}'){
                if(st.size()>0 && st.peek() =='{' ){
                    st.pop();
                }
                else{
                    System.out.println("not balanced");
                    return;
                }
                  
                
            }
            else if(ch==']'){
                if(st.size()>0 && st.peek() =='[' ){
                    st.pop();
                }
                else{
                    System.out.println("not balanced");
                    return;
                }
                  
            }
        }
        if(st.size()>0 ){
            System.out.println("not balanced");
            return;
        }
        else{
            System.out.println("balanced");
            return;
        }
    }
}
