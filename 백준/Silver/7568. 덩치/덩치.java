import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] human = new String[Integer.parseInt(br.readLine())];
        for (int i = 0; i < human.length; i++) {
            human[i] = br.readLine();
        }
        play(human);
        br.close();
        bw.flush();
        bw.close();
    }

    public static void play(String[] human) throws IOException {
        int[] number = new int[human.length];
        for (int i = 0; i < human.length; i++) {
            String[] person1 = human[i].split(" ");
            number[i]++;
            for (int j = 0; j < human.length; j++) {
                if (i != j) {
                    String[] person2 = human[j].split(" ");
                    if (Integer.parseInt(person1[0]) < Integer.parseInt(person2[0])) {
                        if (Integer.parseInt(person1[1]) < Integer.parseInt(person2[1])) {
                            number[i] += 1;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < number.length; i++) {
            bw.write(String.valueOf(number[i]) + " ");
        }
    }
}