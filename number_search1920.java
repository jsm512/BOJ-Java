import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class number_search1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < arr2.length; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i = 0; i < arr2.length; i++){
            System.out.println(binarySearch(arr,arr2[i]));
        }
        System.out.println(5/2);
    }

    private static int binarySearch(int[] arr, int i) {
        int low = 0;
        int high = arr.length-1;
        int mid = 0;

        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid] == i) return 1;
            else if(arr[mid] > i) high=mid-1;
            else if(arr[mid] < i) low = mid+1;
        }
        return 0;
    }
}
