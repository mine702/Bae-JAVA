import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[][] map = new boolean[N][M];

        for(int i = 0 ; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < M; j++){
                if(str.charAt(j) == 'O')
                    map[i][j] = true;
                else
                    map[i][j] = false;    
            }
        }

        boolean isCheck = false;
        int time = 0;
        for(int i = 0 ; i < M; i++){
            time++;
            boolean isTime = true;
            for(int j = 0 ; j < N; j++){
                if(map[j][i]){
                    isTime = false;
                    break;
                }
            }
            if(isTime){
                isCheck = true;
                break;
            }
        }
        if(isCheck)
            sb.append(time);
        else
            sb.append("ESCAPE FAILED");

        System.out.println(sb);
    }
}