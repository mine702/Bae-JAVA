import java.io.*;
import java.util.*;

public class Main {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static int m = 0;
    private static int answer = 0;

    public static void main(String[] args)throws IOException{
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[] numbers = new int[n];
        boolean[] visited = new boolean[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < n; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        combination(numbers, visited, 0, n, 3);

        bw.write(String.valueOf(answer));
        bw.flush();
    }

    public static void combination(int[] arr, boolean[] visited, int start, int n, int r){
        
        if(r == 0){
            int sum = 0;
            for(int i = 0; i < n; i++){
                if(visited[i])
                    sum += arr[i];
            }
            if(m >= sum && answer < sum)
                answer = sum;

            return;
        }

        for(int i = start; i < n ; i++){
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }

    }
}
