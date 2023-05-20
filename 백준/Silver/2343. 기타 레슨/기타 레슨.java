import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[] lectures = new int[N];
        int maxLectureLength = 0;
        int sumLectureLength = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            lectures[i] = Integer.parseInt(st.nextToken());
            maxLectureLength = Math.max(maxLectureLength, lectures[i]);
            sumLectureLength += lectures[i];
        }

        int result = binarySearch(lectures, maxLectureLength, sumLectureLength);
        System.out.println(result);
    }

    public static int binarySearch(int[] lectures, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            int count = 1;
            int sum = 0;
            for (int i = 0; i < N; i++) {
                if (sum + lectures[i] > mid) {
                    count++;
                    sum = lectures[i];
                } else {
                    sum += lectures[i];
                }
            }
            if (count <= M) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
