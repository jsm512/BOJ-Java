import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class star_recursive10994 {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int size = 4 * (n - 1) + 1;
        arr = new char[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                arr[i][j]=' ';
            }
        }
        
        solve(size, 0);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

    public static void solve(int size, int r) {
        for (int i = r; i < size; i++) {
            arr[r][i] = '*';
            arr[i][r] = '*';
            arr[size - 1][i] = '*';
            arr[i][size - 1] = '*';
        }
        if (size == 1)
            return;
        solve(size - 2, r + 2);
    }
}
