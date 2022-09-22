import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[] number = new int[Integer.parseInt(br.readLine())];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(number);
        int length = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            int target = Integer.parseInt(st.nextToken());
            Boolean check = binarySearch(number, target);
            if (check == true) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }

    public static boolean binarySearch(int[] array, int target) {

        int start = 0;
        int end = array.length - 1;
        int mid = (end + start) / 2;

        while (end - start >= 0) {
            if (array[mid] == target) {
                return true;
            } else if (array[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (end + start) / 2;
        }
        return false;
    }
}