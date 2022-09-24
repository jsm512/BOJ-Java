import java.util.Scanner;

public class scale2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[8];
        for(int i = 0; i < input.length; i++){
            input[i] = sc.nextInt();
        }
        String str = ""; //값을 반환할 String
        for(int i = 0; i < input.length-1; i++){ //if문 input[i+1] index오류를 생각해 input.length-1까지
            if(input[i] == input[i+1] - 1){ //값을 반환할 String필요
                str = "ascending";
            }
            else if(input[i] == input[i+1] + 1){
                str = "descending";
            }
            else{
                str = "mixed";
                break;
    
            }
            
        }       
        System.out.println(str);
    }
}
