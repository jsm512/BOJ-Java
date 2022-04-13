import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class all_permutation10974 {
    public static int n;
    public static boolean[] check;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        check = new boolean[n];
        arr = new int[n];

        solve(0);

        System.out.println(sb);
    }

    public static void solve(int k) {
        if (k == n) {
            for (int x : arr) {
                sb.append(x).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                arr[k] = i + 1;
                check[i] = true;
                solve(k + 1);
                check[i] = false;
            }
        }
    }
}
