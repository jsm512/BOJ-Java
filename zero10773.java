import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class zero10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());

        Stack<Integer> arr = new Stack<>();

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n != 0){
                arr.push(n);
            }
            else{
                arr.pop();
            }
        }
        int sum = 0;
        for(int i = 0; i < arr.size(); i++){
            sum+=arr.get(i);
        }
        System.out.println(sum);
    }
}
