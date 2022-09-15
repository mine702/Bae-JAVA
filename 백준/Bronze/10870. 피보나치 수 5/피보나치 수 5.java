import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[Integer.parseInt(br.readLine()) + 1];
        for (int i = 0; i < num.length; i++) {
            if (i == 0) {
                num[i] = i;
            } else if (i == 1) {
                num[i] = 1;
            } else {
                num[i] = num[i - 2] + num[i - 1];
            }
        }
        System.out.println(num[num.length - 1]);
    }
}