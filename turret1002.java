import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class turret1002 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        int t = Integer.parseInt(br.readLine());
        
        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1=Integer.parseInt(st.nextToken());
            int y1=Integer.parseInt(st.nextToken());
            int r1=Integer.parseInt(st.nextToken());
            int x2=Integer.parseInt(st.nextToken());
            int y2=Integer.parseInt(st.nextToken());
            int r2=Integer.parseInt(st.nextToken());

            System.out.println(marin_point(x1,y1,r1,x2,y2,r2));
        }
    }
    public static int marin_point(int x1,int y1,int r1,int x2,int y2,int r2) {
        int r = (int)(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));

        if(x1==x2&&y1==y2&&r1==r2){
            return -1;
        }
        else if(r==Math.pow(r2+r1,2)){
            return 1;
        }
        else if(r==Math.pow(r2-r1, 2)){
            return 1;
        }
        else if(r>Math.pow(r1+r2, 2)){
            return 0;
        }
        else if(r < Math.pow(r2-r1, 2)){
            return 0;
        }
        else{
            return 2;
        }
    }
}