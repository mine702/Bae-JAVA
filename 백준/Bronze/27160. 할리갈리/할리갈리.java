import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> HG = new HashMap<String, Integer>();
        int n = Integer.parseInt(br.readLine());
        boolean answer = false;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int number = Integer.parseInt(st.nextToken());
            if (HG.containsKey(name)) {
                int value = HG.get(name);
                int result = value + number;
                HG.put(name, result);
            } else {
                HG.put(name, number);
            }
        }
        List<Integer> valueList = new ArrayList<>(HG.values());
        for (int i = 0; i < valueList.size(); i++) {
            if (valueList.get(i) == 5) {
                answer = true;
            }
        }
        if (answer == true) {
            sb.append("YES");
        } else {
            sb.append("NO");
        }
        System.out.println(sb);
        br.close();
    }
}