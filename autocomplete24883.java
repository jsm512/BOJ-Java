import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class autocomplete24883 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char input = br.readLine().charAt(0);

        if(input=='N'||input=='n'){
            System.out.println("Naver D2");
        }
        else{
            System.out.println("Naver Whale");
        }
    }
}