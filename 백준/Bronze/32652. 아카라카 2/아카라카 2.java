import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        String str = "RAKA";
        String answer = "";
        for(int i = 0 ; i < N; i++){
            if(i == 0)
                answer = "AKARAKA";
            else
                answer += str;
        }
        sb.append(answer);
        System.out.print(sb);
    }
}
