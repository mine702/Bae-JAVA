import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int player = 0;
        int n = Integer.parseInt(br.readLine());
        HashSet<Character> hashSet = new HashSet<>();
        char[] Fn = new char[n];
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            hashSet.add(name.charAt(0));
            Fn[i] = name.charAt(0);
        }
        Character[] arr = hashSet.toArray(new Character[0]);
        Arrays.sort(arr);
        Arrays.sort(Fn);
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < Fn.length; j++) {
                if (arr[i] == Fn[j]) {
                    count++;
                }
            }
            if (count >= 5) {
                bw.write(arr[i]);
                player++;
            }
        }
        if (player == 0) {
            bw.write("PREDAJA");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
