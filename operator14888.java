import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class operator14888 {
    static int n;
    static int[] input;
    static int[] op;
    static boolean[] check;
    static long max = -1000000000;
    static long min = 1000000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        input = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        op = new int[4];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < op.length; i++) {
            op[i] = Integer.parseInt(st.nextToken());
        }
        solv(1, input[0]);
        System.out.println(max);
        System.out.println(min);
    }

    public static void solv(int k, long res) {
        if (k == n) {
            max = Math.max(res,max);
            min = Math.min(res,min);
            return;
        }
        for (int i = 0; i < op.length; i++) {
            if (op[i] > 0) {
                op[i]--;
                if (i == 0) {
                    solv(k+1,res+input[k]);
                } else if (i == 1) {
                    solv(k+1,res-input[k]);
                } else if (i == 2) {
                    solv(k+1,res*input[k]);
                } else if(i==3){
                    solv(k+1,res/input[k]);
                }
                op[i]++;
            }
        }
    }
}
