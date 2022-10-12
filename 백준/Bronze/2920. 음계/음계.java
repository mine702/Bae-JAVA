import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String code = br.readLine();
        if (code.equals("1 2 3 4 5 6 7 8")) {
            bw.write("ascending");
        } else if (code.equals("8 7 6 5 4 3 2 1")) {
            bw.write("descending");
        } else {
            bw.write("mixed");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}