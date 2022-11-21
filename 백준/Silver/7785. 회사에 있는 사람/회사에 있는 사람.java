import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        HashSet<String> set = new HashSet<String>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String order = st.nextToken();
            switch (order) {
                case "enter":
                    set.add(name);
                    break;
                case "leave":
                    set.remove(name);
                    break;
            }
        }
        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

}
