import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s = br.readLine();

        switch (s){
            case "1)(": sb.append(1); break;
            case "1()": sb.append(1); break;
            case "(1)": sb.append(0); break;
            case ")1(": sb.append(2); break;
            case ")(1": sb.append(1); break;
            case "()1": sb.append(1); break;
        }

        System.out.println(sb);
    }
}