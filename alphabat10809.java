import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class alphabat10809 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        for(int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }
        String s = br.readLine();
//내가 푼 풀이
        for(int i = 0; i < 26; i++){
            for(int j = 0;j < s.length(); j++){
                if((char)(97+i) == s.charAt(j)){
                    arr[i] = j;
                    break;
                }
            }
        }
        //간단 풀이
        // for(int i = 0; i < s.length(); i++){
        //     if(arr[s.charAt(i)-'a'] == -1){
        //         arr[s.charAt(i)-'a']=i;
        //     }
        // }
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
