import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] word = new String[Integer.parseInt(br.readLine())];
        for (int i = 0; i < word.length; i++) {
            word[i] = br.readLine();
        }
        for (int i = 0; i < word.length; i++) {
            System.out.println(isPalindrome(word[i]));
        }
    }

    public static String recursion(String word, int l, int r, int run) {
        char[] words = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            words[i] = word.charAt(i);
        }
        if (l >= r) {
            return "1 " + run;
        } else if (words[l] != words[r]) {
            return "0 " + run;
        } else {
            run++;
            return recursion(word, l + 1, r - 1, run);
        }
    }
    public static String isPalindrome(String word) {
        int run = 1;
        return recursion(word, 0, word.length() - 1, run);
    }
}