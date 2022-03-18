import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class chess1018 {
    static char[][] B_start_chess={
        {'B','W','B','W','B','W','B','W'},
        {'W','B','W','B','W','B','W','B'},
        {'B','W','B','W','B','W','B','W'},
        {'W','B','W','B','W','B','W','B'},
        {'B','W','B','W','B','W','B','W'},
        {'W','B','W','B','W','B','W','B'},
        {'B','W','B','W','B','W','B','W'},
        {'W','B','W','B','W','B','W','B'},
    };
    static char[][] W_start_chess={
        {'W','B','W','B','W','B','W','B'},
        {'B','W','B','W','B','W','B','W'},
        {'W','B','W','B','W','B','W','B'},
        {'B','W','B','W','B','W','B','W'},
        {'W','B','W','B','W','B','W','B'},
        {'B','W','B','W','B','W','B','W'},
        {'W','B','W','B','W','B','W','B'},
        {'B','W','B','W','B','W','B','W'},
    };
    static int B_min=0;
    static int W_min=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] chess = new char[n][m];
        for (int i = 0; i < chess.length; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                chess[i][j] = str.charAt(j);
            }
        }

        int min = 64;
        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                for (int k = 0; k < 8; k++) {
                    for (int p = 0; p < 8; p++) {
                        if(B_start_chess[k][p] != chess[k+i][p+j]){
                            B_min++;
                        }
                        else if(W_start_chess[k][p] != chess[k+i][p+j]){
                            W_min++;
                        }
                    }
                }
                min=Integer.min(min,Integer.min(B_min,W_min));
                B_min=0;
                W_min=0;
            }
        }
        System.out.println(min);
    }
}