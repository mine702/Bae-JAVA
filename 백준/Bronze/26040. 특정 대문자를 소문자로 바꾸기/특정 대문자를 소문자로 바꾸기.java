import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String A = br.readLine();
        String B = br.readLine();
        String[] bStrings = B.split(" ");
        String result = "";
        for (int i = 0; i < A.length(); i++) {
            int length = result.length();
            char a = A.charAt(i);
            for (int j = 0; j < bStrings.length; j++) {
                char b = bStrings[j].charAt(0);
                if (a == b) {
                    char fuck = (char)(b + 32);
                    result += fuck;
                }
            }
            if(length == result.length()){
                result += a;
            }
        }
        bw.write(result);
        br.close();
        bw.flush();
        bw.close();
    }

}
