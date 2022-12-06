import java.io.*;
import java.util.*;

public class Main {

    public static class List implements Comparable<List> {
        private int price;
        private String name;

        public List(int price, String name) {
            this.price = price;
            this.name = name;
        }

        @Override
        public int compareTo(Main.List o) {
            return o.price - this.price;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int P = Integer.parseInt(br.readLine());
            ArrayList<List> lists = new ArrayList<>();
            for (int j = 0; j < P; j++) {
                st = new StringTokenizer(br.readLine());
                int price = Integer.parseInt(st.nextToken());
                String name = st.nextToken();
                lists.add(new List(price, name));
            }
            Collections.sort(lists);
            bw.write(lists.get(0).name + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}