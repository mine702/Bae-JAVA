import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (String.valueOf(i).contains("50")) {
                count++;
            }
        }

        int answer = N + count;
        if (String.valueOf(N).contains("50")) {
            answer--; // N이 "50"을 포함하면 처음 등장 시점은 중복 전에 해당
        }

        System.out.println(answer);
    }
}
