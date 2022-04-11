import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N_M15657 {
    public static int n, m;
    public static boolean[] check;
    public static int[] arr;
    public static int[] input;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        check = new boolean[n];
        input = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);
        solve(0, input);
        System.out.println(sb);
    }

    public static void solve(int k, int[] input) {
        if (k == m) {
            for (int x : arr) {
                sb.append(x).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = 0; i < n; i++) {
            if (k > 0 && arr[k - 1] > input[i]) {
                continue;
            }
            arr[k] = input[i];
            solve(k + 1, input);
        }
    }
}
