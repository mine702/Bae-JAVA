import java.io.*;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LocalDate now = LocalDate.now(); 
        // 포맷 정의
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy\nMM\ndd"); 
        // 포맷 적용
        String formatedNow = now.format(formatter);
        System.out.println(formatedNow);
        br.close();
        bw.flush();
        bw.close();
    }
}