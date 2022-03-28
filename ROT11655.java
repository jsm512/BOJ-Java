import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ROT11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] input = br.readLine().toCharArray();
        for (int i = 0; i < input.length; i++) {
            if (input[i] >= 'A' && input[i] <= 'Z') {
                if (input[i] < 'N') {
                    input[i] += 13;
                } else {
                    input[i] -= 13;
                }
            } else if (input[i] >= 'a' && input[i] <= 'z') {
                if (input[i] < 'n') {
                    input[i] += 13;
                } else {
                    input[i] -= 13;
                }
            }
        }
        for (char x : input) {
            System.out.print(x);
        }

    }
}
