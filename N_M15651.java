import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_M15651 {
    public static StringBuilder sb = new StringBuilder();
    public static int n, m;
    public static int arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        solve(0);
        System.out.println(sb);
    }

    public static void solve(int k) {
        if (k == m) {
            for (int x : arr) {
                sb.append(x).append(" ");
            }
            return;
        }
        for (int i = 0; i < n; i++) {
            arr[k] = i + 1;
            solve(k + 1);
        }
    }
}
