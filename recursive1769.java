import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recursive1769 {
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String x = br.readLine();
        if(solve(x)%3==0){
            System.out.println(cnt+"\n"+"YES");
        }
        else{
            System.out.println(cnt+"\n"+"NO");
        }
    }

    public static int solve(String x) {
        int y = 0;
        if(x.length()<2){
            return Integer.parseInt(x);
        }
        else{
            for(int i = 0; i < x.length(); i++){
                y+=Integer.parseInt(x.charAt(i)+"");
            }
            cnt++;
            return solve(y+"");
        }
    }
}
