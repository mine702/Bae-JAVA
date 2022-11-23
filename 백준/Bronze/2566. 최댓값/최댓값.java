import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[][] numbers = new int[9][9];
        int nm = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < numbers[i].length; j++) {
                int num = Integer.parseInt(st.nextToken());
                numbers[i][j] = num;
                if (j == 0 && i == 0) {
                    nm = num;
                } else if (nm < num) {
                    nm = num;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == nm) {
                    bw.write(String.valueOf(nm) + "\n");
                    bw.write(String.valueOf(i + 1) + " " + String.valueOf(j + 1));
                    count++;
                    break;
                }
            }
            if(count != 0){
                break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

}
