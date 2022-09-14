import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] words = new String[Integer.parseInt(br.readLine())];
        for (int i = 0; i < words.length; i++) {
            words[i] = br.readLine();
        }
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(words));
        String[] resultWords = hashSet.toArray(new String[0]);
        Arrays.sort(resultWords);
        Arrays.sort(resultWords, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        for (int i = 0; i < resultWords.length; i++) {
            System.out.println(resultWords[i]);
        }
    }
}