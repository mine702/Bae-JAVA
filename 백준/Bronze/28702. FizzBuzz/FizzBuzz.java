import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int count = 0;
        int number = 0;

        for (int i = 0; i < 3; i++) {
            String num = br.readLine();
            Boolean isCheck = !num.equals("FizzBuzz") && !num.equals("Fizz") && !num.equals("Buzz");
            if (!num.equals("FizzBuzz") && !num.equals("Fizz") && !num.equals("Buzz")) {
                count = i;
                number = Integer.parseInt(num);
            }
        }
        for (int i = count + 1; i < 4; i++) {
            number++;
        }
        if (number % 3 == 0 && number % 5 == 0)
            sb.append("FizzBuzz");
        else {
            if (number % 3 == 0)
                sb.append("Fizz");
            else if (number % 5 == 0)
                sb.append("Buzz");
            else
                sb.append(number);
        }
        System.out.println(sb);
    }
}