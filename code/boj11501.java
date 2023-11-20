import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11501_s {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        /**
         * 3가지 행동
         * 1. 주식을 삼
         * 2. 원하는 만큼 주식을 팜
         * 3. 아무것도 안함
         * 가격이 가장 낮을 때 사서 가장 비쌀 때 팔면 됨
         */
        int T = Integer.parseInt(br.readLine());
        int[] arr;
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            arr = new int[n];
            long profit = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int maxValue = arr[n - 1];

            for (int j = arr.length - 1; j >= 0; j--) {
                if (arr[j] > maxValue) {
                    maxValue = arr[j];
                } else {
                    profit += (maxValue - arr[j]);
                }
            }
            System.out.println(profit);
        }
        br.close();
    }
}
