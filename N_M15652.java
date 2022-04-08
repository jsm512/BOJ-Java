import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_M15652 {
    public static int n, m;
    public static boolean[] check;
    public static int[] arr;
    public static int cnt = 1;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        check = new boolean[n + 1];

        solve(0);

        System.out.println(sb);
    }

    public static void solve(int k) {
        if (k == m) {
            for (int x : arr) {
                sb.append(x).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = 1; i <= n; i++) {
            if(k>0 && arr[k-1] > i) continue;
            arr[k] = i;
            solve(k+1); 
        }

    }
}
