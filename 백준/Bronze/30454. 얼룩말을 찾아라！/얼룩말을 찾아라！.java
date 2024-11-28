import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int answer = 0;
        int count = 0;

        for(int i = 0; i < n; i++){
            String str = br.readLine();
            boolean isCheck = false;
            int temp = 0;
            for(int j = 0; j < str.length(); j++){
                char c = str.charAt(j);
                if(c == '1' && !isCheck){
                    isCheck = true;
                    temp += 1;
                }else if(c =='0'){
                    isCheck = false;
                }
            }

            if(temp > answer){
                count = 1;
                answer = temp;
            }else if( temp == answer ){
                count++;
            }
        }
        sb.append(answer).append(" ").append(count);
        System.out.println(sb);
    }
}
