import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());   //출석 도장 개수
		int P = Integer.parseInt(br.readLine());   //구매가
		int result = calculateDiscountPrice(N, P); //할인가
		br.close();
		System.out.printf("%d", result < 0 ? 0 : result);
	}
	
	public static int calculateDiscountPrice(int N, int P) {
		if(20 <= N) {
			return (int) Math.min(P-(P*0.25), P-2000);
		} else if(15 <= N) {
			return (int) Math.min(P-2000, P-(P*0.1));
		} else if(10 <= N) {
			return (int) Math.min(P-(P*0.1), P-500);
		} else if(5 <= N) {
			return P-500;
		} else {
			return P;
		}
	}
}