import java.util.Scanner;
import java.util.Arrays;

public class boj1018 {
    static char[][] wrr = {
            { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
            { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
            { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
            { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
            { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
            { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
            { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
            { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
    };
    static char[][] brr = {
            { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
            { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
            { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
            { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
            { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
            { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
            { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
            { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
    };
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            arr[i] = str.toCharArray();
        }
        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                int cnt_b = 0;
                int cnt_w = 0;
                // for (int k = i; k < i + 8; k++) {
                // for (int p = j; p < j + 8; p++) {
                // if (arr[k][p] != brr[k][p]) {
                // cnt_b++;
                // }
                // if (arr[k][p] != wrr[k][p]) {
                // cnt_w++;
                // }
                // }
                // min = Math.min(Math.min(cnt_b, cnt_w), min);
                // }

                for (int k = 0; k < 8; k++) {
                    for (int p = 0; p < 8; p++) {
                        if (arr[k + i][p + j] != brr[k][p]) {
                            cnt_b++;
                        }
                        if (arr[k + i][p + j] != wrr[k][p]) {
                            cnt_w++;
                        }
                    }
                }
                min = Math.min(Math.min(cnt_b, cnt_w), min);

            }
        }
        System.out.println(min);
    }
}
