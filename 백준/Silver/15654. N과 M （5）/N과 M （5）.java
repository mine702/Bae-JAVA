import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        int[] isCheck = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        backtracking(arr, N, M, 0, 1, isCheck, sb);

        System.out.print(sb);
    }

    public static void backtracking(int[] arr, int N, int M, int depth, int start, int[] isCheck, StringBuilder sb){
        if(depth == M){
            for(int i = 1 ; i <= M; i++){
                for(int j = 0; j < N; j++){
                    if(isCheck[j] == i) {
                        sb.append(arr[j] + " ");
                        break;
                    }
                }
            }
            sb.append("\n");
            return;
        }

        for(int i=0; i<N; i++){
            if(isCheck[i] != 0) continue;

            isCheck[i] = start;
            backtracking(arr, N, M, depth+1, start+1, isCheck, sb);
            isCheck[i] = 0;
        }
    }
}
