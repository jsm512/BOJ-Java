import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class alphabat10809 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int[] arr = new int[26];
        for(int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }
        for(int i = 0; i < 26; i++){
            for(int j = 0; j < s.length(); j++){
                if((char)(97+i) == s.charAt(j)){
                    arr[i]=j;
                    break;
                }
            }
        }
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
