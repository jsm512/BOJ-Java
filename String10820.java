import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String10820 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input="";
        while((input=br.readLine())!=null){
            int lower=0,upper=0,number=0,blank=0; //int[] arr =new int[4];
            for(int i = 0; i < input.length(); i++){
                char ch = input.charAt(i);
                if(ch>='A' && ch <='Z') upper++;
                else if(ch>='a'&&ch<='z') lower++;
                else if(Character.isDigit(ch)) number++;
                else if(ch==' ') blank++;
            }
            System.out.println(lower+" "+upper+" "+number+" "+blank);
        }
    }
}
