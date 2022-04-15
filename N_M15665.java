import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class N_M15665 {
    public static int n, m;
    public static boolean[] check;
    public static int[] arr;
    public static int[] input;
    public static LinkedHashSet<String> set = new LinkedHashSet<>();
    public static String str;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        check = new boolean[n];
        arr = new int[m];
        input = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(input);

        solve(0, input);
        Iterator iter = set.iterator();
        for (int i = 0; i < set.size(); i++) {
            System.out.println(iter.next());
        }
    }
    public static void solve(int k, int[] input){
        if (k == m) {
            str = "";
            for (int x : arr) {
                str += Integer.toString(x);
                str += ' ';
            }
            set.add(str);
            return;
        }
        for (int i = 0; i < n; i++) {
            arr[k] = input[i];
            solve(k+1,input);

        }
    }
}
