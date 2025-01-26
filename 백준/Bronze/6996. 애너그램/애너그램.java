import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inNum = Integer.parseInt(bf.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        if ( inNum < 100 ){
            for (int i = 1; i <= inNum; i++) {
                st = new StringTokenizer(bf.readLine(), " ");
                String a1 = st.nextToken();
                String a2 = st.nextToken();

                String[] a1Arr = a1.split("");
                Arrays.sort(a1Arr);
                String[] a2Arr = a2.split("");
                Arrays.sort(a2Arr);

                if ( Arrays.toString(a1Arr).equals(Arrays.toString(a2Arr)) ){
                    sb.append(a1+" & "+a2+" are anagrams.\n");
                }else {
                    sb.append(a1+" & "+a2+" are NOT anagrams.\n");
                }
            }
            bw.write(String.valueOf(sb));
        }

        bw.flush();
        bf.close();
        bw.close();

    }
}
