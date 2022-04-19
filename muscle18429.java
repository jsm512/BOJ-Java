import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class muscle18429 {
    public static int n,k;
    public static int[] arr;
    public static boolean[] check;
    public static int cnt;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        check = new boolean[n];
        cnt = 0;
        solve(500,0);
        System.out.println(cnt);
        
    }
    public static void solve(int sum, int depth){
        if(depth == n){
            cnt++;
            return;
        }
        for(int i = 0; i < n; i++){
            if(!check[i] && (sum+arr[i]-k)>=500){
                check[i] = true;
                solve(sum+arr[i] -k,depth+1);
                check[i] =false;
            }
        }
    }
}
