import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class four_number10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] number = br.readLine().split(" ");
        Long a = Long.parseLong(number[0] + number[1]);
        Long b = Long.parseLong(number[2] + number[3]);
        System.out.println(a + b);
    }
}
