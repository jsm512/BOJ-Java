import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Film_director1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int number = 666;
        int cnt = 1;

        while (cnt != n) {
            number++;
            if (String.valueOf(number).contains("666")) {
                cnt++;
            }
        }
        System.out.println(number);
    }
}
