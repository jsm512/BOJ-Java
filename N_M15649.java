import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_M15649 {
    public static int n,m;
    public static boolean[] check;
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        check = new boolean[n];
        arr = new int[m];
        solve(0);

    }
    public static void solve(int k){
        if(k == m){
            for(int i = 0; i < m; i++){
               System.out.print(arr[i]+" "); 
            }
            System.out.println();
            return;
        }
        for(int i = 0; i < n; i++){
            if(!check[i]){
                arr[k]=i+1;
                check[i] = true;
                solve(k+1);
                check[i]=false;
            }
        }
    }
    
}
