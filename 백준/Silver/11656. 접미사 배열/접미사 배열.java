
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        ArrayList<String> values = new ArrayList<String>();
        for (int i = 0; i < str.length(); i++) {
            values.add(str.substring(i));
        }
        Collections.sort(values);
        for (int i = 0; i < values.size(); i++) {
            bw.write(values.get(i) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}