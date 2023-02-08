import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String string = bufferedReader.readLine();

        int answer = 10;

        for (int i = 1; i < string.length(); i++){
            if (string.charAt(i) == string.charAt(i - 1)){
                answer += 5;
            }
            else{
                answer += 10;
            }
        }

        System.out.println(answer);

        bufferedReader.close();

    }
}