import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if(A == B)
            sb.append("=");
        else{
            if((A != 0 && A != 2 && A != 5) && (B != 0 && B != 2 && B != 5)){
                sb.append("=");
            }else if(A != 0 && A != 2&& A!= 5){
                sb.append("<");
            }else if(B != 0 && B != 2&& B!= 5){
                sb.append(">");
            }else{
                if(A == 0){
                    if(B == 5){
                        sb.append("<");
                    }else{
                        sb.append(">");
                    }
                }else if(A == 2){
                    if(B == 0){
                        sb.append("<");
                    }else{
                        sb.append(">");
                    }
                }else{
                    if(B == 2){
                        sb.append("<");
                    }else{
                        sb.append(">");
                    }
                }
            }
        }

        System.out.println(sb);
    }
}