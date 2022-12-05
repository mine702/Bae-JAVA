import java.io.*;
import java.util.*;

public class Main {

    public static class Puzzle implements Comparable<Puzzle> {
        private String name;
        private int number;
        private int level;

        public Puzzle(String name, int number, int level) {
            this.name = name;
            this.number = number;
            this.level = level;
        }

        @Override
        public int compareTo(Main.Puzzle o) {
            return this.number - o.number;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        ArrayList<Puzzle> puzzles = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int number = Integer.parseInt(st.nextToken());
            int level = Integer.parseInt(st.nextToken());
            Puzzle puzzle = new Puzzle(name, number, level);
            puzzles.add(puzzle);
        }
        Collections.sort(puzzles);
        for (int i = 0; i < puzzles.size(); i++) {
            int level = puzzles.get(i).level;
            char result = puzzles.get(i).name.charAt(level - 1);
            if (result >= 97 && result <= 122) {
                result = (char) (result - 32);
            }
            bw.write(result);
        }
        br.close();
        bw.flush();
        bw.close();
    }
}