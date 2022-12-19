import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String student = br.readLine();
        int biglength = student.length() - student.replace("b", "").length();
        int selength = student.length() - student.replace("s", "").length();
        if (biglength > selength) {
            bw.write("bigdata?");
        } else if (selength > biglength) {
            bw.write("security!");
        } else {
            bw.write("bigdata? security!");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}