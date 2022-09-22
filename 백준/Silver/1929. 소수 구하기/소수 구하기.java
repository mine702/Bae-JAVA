import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int fn = Integer.parseInt(st.nextToken());
        int sn = Integer.parseInt(st.nextToken());
        for (int i = fn; i <= sn; i++) {
            if (isPrime(i)) {
                bw.write(String.valueOf(i) + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }

    public static boolean isPrime(int number) {
		if(number < 2) {			
			return false;
		}
		if(number == 2) {
			return true;
		}
		for(int i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
}