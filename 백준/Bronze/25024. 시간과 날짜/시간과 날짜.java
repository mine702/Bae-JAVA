import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            String timeValid = isValidTime(x, y) ? "Yes" : "No";
            String dateValid = isValidDate(x, y) ? "Yes" : "No";
            
            bw.write(timeValid + " " + dateValid + "\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
    
    private static boolean isValidTime(int x, int y) {
        return (0 <= x && x <= 23) && (0 <= y && y <= 59);
    }
    
    private static boolean isValidDate(int x, int y) {
        int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return (1 <= x && x <= 12) && (1 <= y && y <= daysInMonth[x]);
    }
}
