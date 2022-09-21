import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> book = new HashMap<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] pokename = new String[N + 1];
        for (int i = 1; i < N + 1; i++) {
            String name = br.readLine();
            book.put(name, i);
            pokename[i] = name;
        }
        for (int i = 0; i < M; i++) {
            String poke = br.readLine();
            Boolean check = poke.chars().allMatch(Character::isDigit);
            if (check == true) {
                bw.write(pokename[Integer.parseInt(poke)] + "\n");
            } else {
                bw.write(String.valueOf((book.get(poke)) + "\n"));
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}