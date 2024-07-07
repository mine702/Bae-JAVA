import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        boolean isCheck = false;

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String name = br.readLine();

            if (name.contentEquals("anj"))
                isCheck = true;

        }

        if (isCheck)
            sb.append("뭐야;");
        else
            sb.append("뭐야?");

        System.out.println(sb);
    }
}