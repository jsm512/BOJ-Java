import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class roma_num16922 {
    public static int n;
    public static boolean[] check = new boolean[1001];
    public static int sum, cnt;
    public static int[] input = { 1, 5, 10, 50 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        solve(0,0,0);
        System.out.println(cnt);

    }

    public static void solve(int k,int sum,int index) {
        if (k == n) {
            if (!check[sum]){
                check[sum] = true;
                cnt++;
            }
            return;
        }
        for (int i = index; i < input.length; i++) {
            solve(k + 1,sum+input[i],i);
        }

    }
}
