import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num_search10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nrr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < nrr.length; i++) {
            nrr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nrr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int input = Integer.parseInt(st.nextToken());
            sb.append((upper_bound(nrr, input) - low_bound(nrr, input))).append(' ');
        }
        System.out.println(sb);
    }

    public static int upper_bound(int[] n, int m) {
        int low = 0;
        int high = n.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (n[mid] > m)
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }

    public static int low_bound(int[] n, int m) {
        int low = 0;
        int high = n.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (n[mid] >= m) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
