import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1931 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        int maxC = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        System.out.println(Arrays.deepToString(arr));
        // for (int i = 0; i < arr.length - 1; i++) {
        // int maxCnt = 0;
        // int next = i;
        // for (int j = i; j < arr.length; j++) {
        // if (arr[next][1] <= arr[j][0]) {
        // maxCnt++;
        // next = j;
        // }
        // }
        // maxC = Math.max(maxCnt, maxC);

        // }

        int next = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[next][1] <= arr[i][0]) {
        // next = i;
        // maxC++;
        // }
        // }

        for (int i = 0; i < arr.length; i++) {
            if (next <= arr[i][0]) {
                next = arr[i][1];
                maxC++;
            }
        }
        System.out.println(maxC);
    }
}
