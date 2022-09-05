import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double[][] arr = new double[Integer.parseInt(br.readLine())][];
        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = new double[Integer.parseInt(st.nextToken())];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Double.parseDouble(st.nextToken());
            }
        }
        for (int i = 0; i < arr.length; i++) {
            double avg = 0;
            double sum = 0;
            double num = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            avg = sum / arr[i].length;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > avg) {
                    num++;
                }
            }
            System.out.println(String.format("%.3f", (num / arr[i].length * 100)) + "%");
        }
    }
}