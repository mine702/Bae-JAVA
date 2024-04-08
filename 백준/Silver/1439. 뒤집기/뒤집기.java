import java.util.*;
import java.io.*;

public class Main {

    public static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        str = br.readLine();

        boolean isCheck = true;
        char ch = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                isCheck = false;
                break;
            }
        }
        if (isCheck)
            sb.append(0);
        else {
            int makeOnes = check('1');
            int makeZeros = check('0');
            if (makeOnes > makeZeros)
                sb.append(makeZeros);
            else if (makeOnes < makeZeros)
                sb.append(makeOnes);
            else
                sb.append(makeZeros);
        }
        System.out.println(sb);
    }

    public static int check(char changeme) {
        int count = 0;
        boolean isCheck = true;

        for (int i = 0; i < str.length(); i++) {
            boolean ifCheck = true;
            if (str.charAt(i) == changeme)
                ifCheck = true;
            else
                ifCheck = false;
            if (isCheck == ifCheck)
                continue;
            else if (str.charAt(i) == changeme)
                isCheck = true;
            else {
                isCheck = false;
                count++;
            }
        }
        return count;
    }

}