package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class rope2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int max_w = 0;
        for (int i = 0; i < n; i++) {
            int w = 0;
            for (int j = i; j < n; j++) {
                w += arr[i];
            }
            if (w > max_w) {
                max_w = w;
            }
        }
        System.out.println(max_w);
    }
}
