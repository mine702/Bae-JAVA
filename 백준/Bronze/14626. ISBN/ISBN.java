import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String isbn = br.readLine();
        int nums[] = { 1,3,1,3,1,3,1,3,1,3,1,3,1 };
        int point = 0;
        int sum = 0;
        int answer = 0;

        for( int i = 0; i < isbn.length(); i++){
            if(isbn.charAt(i) == '*'){
                point = i;
            }else{
                sum += (isbn.charAt(i) - '0') * nums[i];
            }
        }

        for( int i = 1; i < 10; i++ ){
            int num = sum + nums[point] * i;
            if(num % 10 == 0){
                answer = i;
                break;
            }
        }

        sb.append(answer);
        System.out.println(sb);
    }
}
