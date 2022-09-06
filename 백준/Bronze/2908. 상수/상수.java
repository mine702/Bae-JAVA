import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        char[] numberO = new char[String.valueOf(A).length()];
        char[] numberT = new char[String.valueOf(B).length()];
        br.close();
        for (int i = 0; i < String.valueOf(A).length(); i++) {
            numberO[i] = String.valueOf(A).charAt(String.valueOf(A).length() - 1 - i);
        }
        for (int i = 0; i < String.valueOf(B).length(); i++) {
            numberT[i] = String.valueOf(B).charAt(String.valueOf(B).length() - 1 - i);
        }
        String num0 = new String(numberO);
        String numT = new String(numberT);
        if (Integer.parseInt(num0) > Integer.parseInt(numT)) {
            System.out.println(num0);
        } else {
            System.out.println(numT);
        }
    }
}