import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bertand4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int cnt = 0;// 소수의 개수
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            boolean[] check = new boolean[2 * n + 1];
            check[0] = check[1] = true;

            for (int i = 2; i <= 2 * n; i++) {
                if (check[i] == true) {
                    continue;
                }
                for (int j = i + i; j <= 2 * n; j += i) {
                    check[j] = true;
                }
            }
            for (int i = n+1; i <= 2 * n; i++) {
                if (check[i] == false) {
                    cnt++;
                }
            }
            System.out.println(cnt);

        }
    }
}