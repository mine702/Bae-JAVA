import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phone = br.readLine();
        char[] number = new char[phone.length()];
        int[] phnumber = new int[number.length];
        int time = 0;
        for (int i = 0; i < phone.length(); i++) {
            number[i] = phone.charAt(i);
        }
        for (int i = 0; i < number.length; i++) {
            if ('A' <= number[i] && number[i] <= 'C') {
                phnumber[i] = 2;
            } else if ('D' <= number[i] && number[i] <= 'F') {
                phnumber[i] = 3;
            } else if ('G' <= number[i] && number[i] <= 'I') {
                phnumber[i] = 4;
            } else if ('J' <= number[i] && number[i] <= 'L') {
                phnumber[i] = 5;
            } else if ('M' <= number[i] && number[i] <= 'O') {
                phnumber[i] = 6;
            } else if ('P' <= number[i] && number[i] <= 'S') {
                phnumber[i] = 7;
            } else if ('T' <= number[i] && number[i] <= 'V') {
                phnumber[i] = 8;
            } else if ('W' <= number[i] && number[i] <= 'Z') {
                phnumber[i] = 9;
            } else {
                phnumber[i] = 1;
            }
        }
        for (int i = 0; i < phnumber.length; i++) {
            for (int j = 1; j < 10; j++) {
                if (phnumber[i] == j && phnumber[i] == 1) {
                    time += j + 2;
                } else if (phnumber[i] == j) {
                    time += 2 + j - 1;
                }
            }
        }
        System.out.println(time);
    }
}