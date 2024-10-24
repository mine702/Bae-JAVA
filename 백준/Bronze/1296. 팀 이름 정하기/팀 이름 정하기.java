import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String name = br.readLine();
        int N = Integer.parseInt(br.readLine());
        char[] chars = {'L', 'O', 'V', 'E'};
        int[] nameArr = new int[26];

        for(int i = 0; i < name.length(); i++){
            nameArr[name.charAt(i) - 'A']++;
        }

        String answer = "";
        int max = 0;

        for(int i = 0; i < N; i++){
            int[] arr = new int[4];
            int[] ascii = new int[26];
            String teamName = br.readLine();

            if(i == 0)
                answer = teamName;

            for(int j = 0; j < teamName.length(); j++){
                ascii[teamName.charAt(j) - 'A']++;
            }

            for(int j = 0; j < chars.length; j++){
                arr[j] = ascii[chars[j] - 'A'];
                arr[j] += nameArr[chars[j] - 'A'];
            }
            //어떤 수를 100으로 나눈 나머지
            int ans = ((arr[0] + arr[1]) * (arr[0] + arr[2]) * (arr[0] + arr[3]) * (arr[1] + arr[2]) * (arr[1] + arr[3]) * (arr[2] + arr[3])) % 100;
            if(ans > max) {
                max = ans;
                answer = teamName;
            }else if(ans == max){
                if(answer.compareTo(teamName) > 0){
                    answer = teamName;
                }
            }
        }
        sb.append(answer);
        System.out.print(sb);
    }
}
