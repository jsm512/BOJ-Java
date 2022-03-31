import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class factorial_zero_cnt1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        int cnt = 0;

        while (input >= 5) {
            cnt += input/5;
            input/=5;
        }
        System.out.println(cnt);

    }
}
