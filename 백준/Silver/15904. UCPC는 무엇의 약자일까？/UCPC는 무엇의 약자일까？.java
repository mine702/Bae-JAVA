import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String str = br.readLine();
        String result;
        result = str.replaceAll("[a-z]", "").replaceAll(" ", "");
        int num = 0;
        char check[] = {'U', 'C', 'P', 'C'};

        for(int i = 0 ; i < result.length(); i++){
           if(num == 4)
            break;
           
           if(result.charAt(i) == check[num])
            num++;
        }

        if( num == 4 ){
            sb.append("I love UCPC");
        } else {
            sb.append("I hate UCPC");
        }
        System.out.println(sb);
    }
}
