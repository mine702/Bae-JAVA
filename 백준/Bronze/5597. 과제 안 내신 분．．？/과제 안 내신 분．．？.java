import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> student = new ArrayList<>();
        ArrayList<Integer> defult = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            student.add(i);
        }
        for (int i = 0; i < 28; i++) {
            defult.add(Integer.parseInt(br.readLine()));
        }
        student.removeAll(defult);
        for (int i = 0; i < student.size(); i++) {
            bw.write(String.valueOf(student.get(i)) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}