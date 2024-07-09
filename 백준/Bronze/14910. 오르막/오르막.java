import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String str = br.readLine();

        String[] nums = str.split(" ");

        boolean isCheck = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (isCheck)
                break;

            int num1 = Integer.parseInt(nums[i]);
            int num2 = Integer.parseInt(nums[i + 1]);
            if (num1 > num2)
                isCheck = true;
        }
        if (isCheck)
            sb.append("Bad");
        else
            sb.append("Good");
        System.out.println(sb);
    }
}