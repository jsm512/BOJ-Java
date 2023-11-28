import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj2606_bfs {
    static int n, m;
    static int[][] arr;
    static boolean[] visited;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        arr = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        System.out.println(bfs(1));
    }

    public static int bfs(int start) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            int tmp = q.poll();

            for (int i = 1; i <= n; i++) {
                if (arr[tmp][i] == 1 && !visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
