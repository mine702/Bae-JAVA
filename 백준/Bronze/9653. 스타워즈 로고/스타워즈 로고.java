import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("    8888888888  888    88888\n");
        bw.write("   88     88   88 88   88  88\n");
        bw.write("    8888  88  88   88  88888\n");
        bw.write("       88 88 888888888 88   88\n");
        bw.write("88888888  88 88     88 88    888888\n");
        bw.write("\n");
        bw.write("88  88  88   888    88888    888888\n");
        bw.write("88  88  88  88 88   88  88  88\n");
        bw.write("88 8888 88 88   88  88888    8888\n");
        bw.write(" 888  888 888888888 88  88      88\n");
        bw.write("  88  88  88     88 88   88888888\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
