import java.io.*;
import java.util.*;

public class Main {

    public static int[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        nums = new int[N];

        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());

            int[] num = new int[5];
            boolean[] isCheck = new boolean[5];

            for(int j = 0 ; j < num.length; j++){
                num[j] = Integer.parseInt(st.nextToken());
            }

            combination(num, isCheck, 0, 5, 3, i);
        }

        int answer = 0;
        int order = 0;

        for(int i = 0 ; i < N; i++){
            if(nums[i] > answer){
                order = i;
                answer = nums[i];
            }else if(nums[i] == answer){
                if(order < i)
                    order = i;
            }
        }

        sb.append(order + 1);
        System.out.println(sb);
    }

    public static void combination(int[] arr, boolean[] visited, int start, int n, int r, int order){
        if( r == 0 ){
            int sum = 0;

            for(int i = 0; i < n; i++){
                if(visited[i])
                    sum+=arr[i];
            }

            if(nums[order] < sum % 10)
                nums[order] = sum % 10;
        }

        for( int i = start; i < n ; i++ ){
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1, order);
            visited[i] = false;
        }
    }
}
