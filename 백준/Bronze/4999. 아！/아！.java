import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);

        char[] j = a.next().toCharArray();
        char[] d = a.next().toCharArray();
        int j_num = 0, d_num = 0;

        for (int i = 0; j[i] != 'h'; i++) {
            j_num++;
        }

        for (int i = 0; d[i] != 'h'; i++) {
            d_num++;
        }

        if (j_num >= d_num) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }

        a.close();
    }

}