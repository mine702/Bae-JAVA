import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] numbercards = new int[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numbercards.length; i++) {
            numbercards[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbercards);
        int cardle = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cardle; i++) {
            bw.write(String.valueOf(binarySearch(numbercards, Integer.parseInt(st.nextToken()))) + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    public static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        int mid = (end + start) / 2;

        while (end - start >= 0) {
            if (array[mid] == target) {
                // Case: Find target in array
                return 1;
            } else if (array[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (end + start) / 2;
        }
        return 0;
    }
}