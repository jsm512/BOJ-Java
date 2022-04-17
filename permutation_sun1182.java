import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class permutation_sun1182 {
    public static int n, s;
    public static int[] input;
    public static int cnt = 0;
    public static int sum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        input = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        solve(0, 0);

        if (s == 0) {
            cnt--;
        }
        System.out.println(cnt);

    }

    public static void solve(int k, int sum) {
        if (k == n) {
            if (sum == s)
                cnt++;
            return;
        }

        solve(k + 1, sum);
        solve(k + 1, sum + input[k]);
    }
}
