import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class boj12845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];
        int level = 0;
        int gold = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 1; i < n; i++) {
            gold += arr[0] + arr[i];
        }
        System.out.println(gold);

    }
}
