import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == 'P' && i < str.length() - 2){
                if(str.charAt(i + 1) == 'S' && (str.charAt(i + 2) == '4' || str.charAt(i + 2) == '5')){
                    if(i+2 == str.length() - 1)
                        str = str.substring(0, i-- + 2);
                    else
                        str = str.substring(0, i + 2) + str.substring(i-- + 2 + 1);
                }
            }
        }
        sb.append(str);
        System.out.print(sb);
    }
}
