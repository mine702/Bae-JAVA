import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        HashSet<String> memberList = new HashSet<String>();
        memberList.add("ChongChong");
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name1 = st.nextToken();
            String name2 = st.nextToken();
            if (memberList.contains(name1) || memberList.contains(name2)) {
                memberList.add(name1);
                memberList.add(name2);
            }
        }
        bw.write(String.valueOf(memberList.size()));
        br.close();
        bw.flush();
        bw.close();
    }
}