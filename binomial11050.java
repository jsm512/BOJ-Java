import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class binomial11050 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(binomial_coefficient(n,k));
    }

    public static int factorial(int n){
        if(n<=1)return 1;
        return n*factorial(n-1);
    }

    private static int binomial_coefficient(int n, int k) {
        return factorial(n) / (factorial(n-k) * factorial(k));
    }
}
