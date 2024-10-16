import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        HashMap<String,Integer> map = new HashMap<>();
        int answer = 0;
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            if(str.equals("ENTER"))
                map.clear();
            else{
                Integer result = map.get(str);
                if(result == null){
                    answer++;
                    map.put(str,1);
                }
            }
        }
        sb.append(answer);
        System.out.print(sb);
    }
}
