import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class iron_rod10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> st = new Stack<>();
        String str = br.readLine();
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                st.push(str.charAt(i));
            }
            if (str.charAt(i) == ')') {
                st.pop();
                if (str.charAt(i - 1) == '(') {
                    cnt += st.size();
                } else {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
