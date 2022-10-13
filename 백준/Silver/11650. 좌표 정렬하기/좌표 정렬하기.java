import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        XY[] numbers = new XY[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            numbers[i] = new XY(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(numbers, new Comparator<XY>() {
            @Override
            public int compare(XY o1, XY o2) {
                if (o1.X == o2.X) {
                    return o1.Y - o2.Y;
                } else {
                    return o1.X - o2.X;
                }
            }
        });
        for (int i = 0; i < numbers.length; i++) {
            bw.write(String.valueOf(numbers[i].X) + " " + String.valueOf(numbers[i].Y) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    public static class XY {
        int X;
        int Y;

        public XY(int X, int Y) {
            this.X = X;
            this.Y = Y;
        }
    }
}