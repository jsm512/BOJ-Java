import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_M15650 {
    public static int n, m;
    public static boolean[] check;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        check = new boolean[n];
        solve(0);
        System.out.println(sb);
    }

    public static void solve(int k) {
        if (k == m) {
            for (int x : arr) {
                sb.append(x).append(" ");
            }
            sb.append('\n');
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                if (k == 0 || arr[k - 1] <= i) {
                    arr[k] = i + 1;
                    check[i] = true;
                    solve(k + 1);
                    check[i] = false;
                }
            }

        }

    }
}
