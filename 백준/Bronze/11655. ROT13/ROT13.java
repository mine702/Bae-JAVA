import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                int result = str.charAt(i) + 13;
                if (result >= 65 && result <= 90) {
                    sb.append((char) result);
                } else {
                    int a = 91 - result;
                    int b = 65 - a;
                    sb.append((char) b);
                }
            } else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                int result = str.charAt(i) + 13;
                if (result >= 97 && result <= 122) {
                    sb.append((char) result);
                } else {
                    int a = 123 - result;
                    int b = 97 - a;
                    sb.append((char) b);
                }
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.print(sb);
        br.close();
    }
}