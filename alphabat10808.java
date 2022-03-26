import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class alphabat10808 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int[] arr = new int[26];

        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < 26; j++){
                if((char)(97+j) == s.charAt(i)){
                    arr[j]++;
                }
            }
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
