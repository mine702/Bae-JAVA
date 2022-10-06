import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String ap = br.readLine();
        bw.write(String.valueOf(ap.length()));
        br.close();
        bw.flush();
        bw.close();
    }
}