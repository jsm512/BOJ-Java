package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] time = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time);

        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                sum += time[j];
            }
        }
        System.out.println(sum);
    }
}
