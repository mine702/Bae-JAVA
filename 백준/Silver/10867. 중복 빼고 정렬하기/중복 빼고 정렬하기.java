import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

       HashSet<Integer> hashSet = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            hashSet.add(num);
        }

        ArrayList<Integer> list = new ArrayList<>(hashSet);
        Collections.sort(list);

        for(int i = 0 ; i < list.size(); i++){
            sb.append(list.get(i) + " ");
        }
        System.out.println(sb);
    }
}
