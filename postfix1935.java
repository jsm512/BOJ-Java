import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class postfix1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Double> st = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        Double[] arr = new Double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                st.push(arr[str.charAt(i) - 'A']);
            } else {
                Double a, b;
                a = st.pop();
                b = st.pop();
                if (str.charAt(i) == '*') {
                    st.push(b * a);
                } else if (str.charAt(i) == '/') {
                    st.push(b / a);
                } else if (str.charAt(i) == '-') {
                    st.push(b - a);
                } else if (str.charAt(i) == '+') {
                    st.push(b + a);
                }
            }
        }
        System.out.println(String.format("%.2f", st.peek()));
    }
}
