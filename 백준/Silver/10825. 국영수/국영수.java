import java.io.*;
import java.util.*;

class Human implements Comparable<Human> {
    String name;
    int score1;
    int score2;
    int score3;

    public Human(String name, int score1, int score2, int score3) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    @Override
    public int compareTo(Human human) {
        if (this.score1 == human.score1) {
            if (this.score2 == human.score2) {
                if (this.score3 == human.score3) {
                    return this.name.compareTo(human.name);
                }
                return human.score3 - this.score3;
            }
            return this.score2 - human.score2;
        }
        return human.score1 - this.score1;
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Human[] humans = new Human[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int score1 = Integer.parseInt(st.nextToken());
            int score2 = Integer.parseInt(st.nextToken());
            int score3 = Integer.parseInt(st.nextToken());
            Human human = new Human(name, score1, score2, score3);
            humans[i] = human;
        }
        Arrays.sort(humans);
        for (int i = 0; i < n; i++) {
            bw.write(humans[i].name + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

}
