import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }
        for (int i = 0; i < words[0].length(); i++) {
            char equals = words[0].charAt(i);
            char printword = equals;
            for (int j = 1; j < n; j++) {
                if (equals != words[j].charAt(i)) {
                    printword = '?';
                    break;
                }
            }
            bw.write(printword);
        }
        br.close();
        bw.flush();
        bw.close();
    }

}