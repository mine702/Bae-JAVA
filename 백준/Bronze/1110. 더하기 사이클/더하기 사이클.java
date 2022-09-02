import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int Num = N;
        int number = 0;
        int sum = 0;
        if (N < 10) {
            String min = "0" + String.valueOf(N);
            while (true) {
                int A = Integer.parseInt(min) / 10;
                int B = Integer.parseInt(min) % 10;
                sum = Integer.parseInt(String.valueOf(B) + String.valueOf((A + B) % 10));
                min = String.valueOf(sum);   
                number++;
                if (N == sum) {
                    break;
                }             
            }
        } else {
            while (true) {
                int A = Num / 10;
                int B = Num % 10;
                sum = Integer.parseInt(String.valueOf(B) + String.valueOf((A + B) % 10));
                Num = sum;    
                number++;
                if (N == sum) {
                    break;
                }            
            }
        }
        System.out.println(number);
        br.close();
        bw.flush();
        bw.close();
    }
}