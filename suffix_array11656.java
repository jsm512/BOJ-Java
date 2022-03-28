import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class suffix_array11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] arr = new String[input.length()];

        for (int i = 0; i < input.length(); i++) {
            arr[i] = input.substring(i, input.length());
        }
        Arrays.sort(arr);

        for (String str : arr) {
            System.out.println(str);
        }
    }
}
