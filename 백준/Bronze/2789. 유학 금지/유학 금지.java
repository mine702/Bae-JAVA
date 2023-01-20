import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String chr = br.readLine();
        String cge = "CAMBRIDGE";
        for(int i = 0;i<chr.length();i++){
            boolean result = true;
            for(int j = 0;j<cge.length();j++){
                if(chr.charAt(i) == cge.charAt(j)){
                    result = false;
                    break;
                }
            }
            if(result == true){
                sb.append(chr.charAt(i));
            }
        }
        System.out.println(sb);
        br.close();
    }
}