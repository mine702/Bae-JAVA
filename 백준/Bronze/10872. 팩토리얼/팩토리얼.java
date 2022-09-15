import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 1;
        for (int i = num; i >= 1; i--) {
            if (num == i) {
                sum = num;
            } else {
                sum = sum * i;
            }
        }
        System.out.println(sum);
    }
}