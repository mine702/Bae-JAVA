import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("     /~\\\n");
        bw.write("    ( oo|\n");
        bw.write("    _\\=/_\n");
        bw.write("   /  _  \\\n");
        bw.write("  //|/.\\|\\\\\n");
        bw.write(" ||  \\ /  ||\n");
        bw.write("============\n");
        bw.write("|          |\n");
        bw.write("|          |\n");
        bw.write("|          |\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
