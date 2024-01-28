import java.util.*;
import java.io.*;

public class Main {
    static char[] king, rock;
    static int n;

    public static void main(String args[]) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk = new StringTokenizer(bfr.readLine()," ");
        king = stk.nextToken().toCharArray(); rock = stk.nextToken().toCharArray(); n = Integer.parseInt(stk.nextToken());
        for(int i=0; i<n; i++) {
            String cmd = bfr.readLine();
            char[] next_king = move(cmd, king);
            if(isInRange(next_king)){ 
                if(next_king[0]==rock[0] && next_king[1]==rock[1]){ 
                    char[] next_rock = move(cmd,rock);
                    if(isInRange(next_rock)){ 
                        king = next_king;
                        rock = next_rock;
                    }
                    else    continue; 
                }
                else{ 
                    king = next_king;
                }
            }
            else    continue; 
        }

        bfw.write(String.valueOf(king[0]) + String.valueOf(king[1]) + "\n");
        bfw.write(String.valueOf(rock[0]) + String.valueOf(rock[1]));
        bfw.close();
    }

    static Boolean isInRange(char[] a){
        if(a[0]<'A' || a[0]>'H' || a[1]<'1' || a[1]>'8')    return false;
        else return true;
    }

    static char[] move(String cmd, char[] target){
        char[] result = target.clone();
        switch(cmd){
            case "R":
                result[0]++;
                break;
            case "L":
                result[0]--;
                break;
            case "B":
                result[1]--;
                break;
            case "T":
                result[1]++;
                break;
            case "RT":
                result[0]++;    result[1]++;
                break;
            case "LT":
                result[0]--;    result[1]++;
                break;
            case "RB":
                result[0]++;    result[1]--;
                break;
            case "LB":
                result[0]--;    result[1]--;
        }
        return result;
    }
}