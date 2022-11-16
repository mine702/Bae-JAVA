import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String iD = br.readLine();
        bw.write(":fan::fan::fan:\n");
        bw.write(":fan::" + iD + "::fan:\n");
        bw.write(":fan::fan::fan:\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
