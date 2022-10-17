import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int number = n / 4;
        for (int i = 0; i < number; i++) {
            bw.write("long ");
        }
        bw.write("int");
        br.close();
        bw.flush();
        bw.close();
    }
}
