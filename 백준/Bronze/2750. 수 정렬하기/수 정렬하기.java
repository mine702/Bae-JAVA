import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] num = new int[Integer.parseInt(br.readLine())];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(num);
        for(int i : num){
            System.out.println(i);
        }
    }
}