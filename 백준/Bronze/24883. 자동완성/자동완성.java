import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String lp = br.readLine();
        if(lp.equals("n") || lp.equals("N")){
            bw.write("Naver D2");
        }else{
            bw.write("Naver Whale");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}