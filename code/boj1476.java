import java.util.Scanner;

public class boj1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int e = sc.nextInt(); // 1~15
        int s = sc.nextInt(); // 1~28
        int m = sc.nextInt(); // 1~19

        // 1년 -> 1 1 1
        // 1년후(2년) -> 2 2 2
        // ... 15년 -> 15 15 15
        // but 16년 -> 1 16 16 e 범위가 15까지 => 첫 번째 자리 15까지 두 번째 자리 28까지 세 번째 자리 19까지

        // 1년부터 시작해서 e,s,m 찾기
        int year = 1;
        int a = 1, b = 1, c = 1;
        while (true) {
            if (a == e && b == s && c == m)
                break;

            year++;
            a++;
            b++;
            c++;
            if (a == 16)
                a = 1;
            if (b == 29)
                b = 1;
            if (c == 20)
                c = 1;
            // if (16 - a < 29 - b) {
            // if (16 - a < 20 - c) {
            // // e가 가장 빨리 끝날 때
            // year += 16 - a;
            // b += 16 - a;
            // c += 16 - a;
            // a = 1;
            // } else {
            // // m이 가장 빨리 끝날 때
            // year += 20 - c;
            // a += 20 - c;
            // b += 20 - c;
            // c = 1;
            // }
            // } else {
            // if (29 - b < 20 - c) {
            // // s가 가장 빨리 끝날 때
            // year += 29 - b;
            // a += 29 - b;
            // c += 29 - b;
            // b = 1;
            // } else {
            // // m이 가장 빨리 끝날 때
            // year += 20 - c;
            // a += 20 - c;
            // b += 20 - c;
            // c = 1;
            // }
            // }
        }
        System.out.println(year);

    }
}
