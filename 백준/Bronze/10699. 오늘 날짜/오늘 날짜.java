import java.io.*;
import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LocalDate now = LocalDate.now();
        bw.write(String.valueOf(now));
        br.close();
        bw.flush();
        bw.close();
    }
}