import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String chr = br.readLine();
        String[] result = chr.split("0");
        for (int i = 0; i < result.length; i++) {
            int count = result[i].length() - result[i].replace("@", "").length();
            sb.append(count + " ");
        }
        System.out.println(sb);
        br.close();
    }
}