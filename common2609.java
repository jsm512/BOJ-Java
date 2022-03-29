import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class common2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int max_common = GCD(a, b);
        int min_common = (a * b) / max_common;
        System.out.println(max_common);
        System.out.println(min_common);

    }

    public static int GCD(int a, int b) {// 유클리드 호제법
        int tmp = 0;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    // public static void LCM(int a, int b) {
    // ArrayList<Integer> arr =new ArrayList<>();
    // for (int i = 1; i <= b; i++) {
    // for (int j = 1; j <= a; j++) {
    // if (a * i == b * j) {
    // arr.add(a*i);
    // }
    // }
    // }
    // System.out.println(arr.get(0));
    // }
}
