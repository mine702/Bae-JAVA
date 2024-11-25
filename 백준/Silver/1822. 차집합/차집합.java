import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        TreeSet<Integer> Aset = new TreeSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<A; i++) {
            Aset.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int j=0; j<B; j++) {
            int Bnum = Integer.parseInt(st.nextToken());
            Aset.remove(Bnum);
        }


        sb.append(Aset.size()+"\n");
        for (Integer num : Aset) {
            sb.append(num+ " ");
        }
        System.out.println(sb);
    }
}