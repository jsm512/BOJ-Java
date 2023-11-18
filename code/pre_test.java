import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class pre_test {
    static int[] dx = { 0, 0, 1, -1 };
    static int[] dy = { 1, -1, 0, 0 };
    static boolean[][] visit;
    static int place = 0;
    static int lines;
    static int[][] area;
    static int[] ans;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        lines = Integer.parseInt(br.readLine());
        area = new int[lines][lines];
        visit = new boolean[lines][lines];
        ans = new int[lines * lines];
        for (int i = 0; i < lines; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < lines; j++) {
                area[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < lines; j++) {
                if (area[i][j] == 1 && !visit[i][j]) {
                    place++;
                    dfs(i, j);
                }
            }
        }
        Arrays.sort(ans);
        System.out.println(place);

        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == 0) {
            } else {
                System.out.print(ans[i] + " ");
            }
        }
    }

    private static void dfs(int x, int y) {
        visit[x][y] = true;
        ans[place]++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < lines && ny < lines) {
                if (area[nx][ny] == 1 && !visit[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
