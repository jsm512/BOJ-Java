import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class balance_word4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(true){
            s= br.readLine();
            if(s.equals(".")){
                break;
            }
            System.out.println(result(s));
        }
    }

    public static String result(String str) {
        Stack<Character> arr = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[') {
                arr.push(ch);
            } else if (ch == ')') {
                if (arr.isEmpty() || arr.peek()!='(') {
                    return "no";
                } else {
                    arr.pop();
                }
            } else if (ch == ']') {
                if (arr.isEmpty() || arr.peek()!='[') {
                    return "no";
                }
                else{
                    arr.pop();
                }
            }
        }
        if(arr.isEmpty()){
            return "yes";
        }
        else{
            return "no";
        }
    }
}
