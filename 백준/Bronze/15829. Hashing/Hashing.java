

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String input = sc.next();
		int r = 31;
		int M = 1234567891;
		
		long now = 0, ans = 0;
		for(int i = 0; i < input.length(); i++) {
			now = input.charAt(i) - 'a' + 1;
			if(ans >= M) ans = ans % M;
			ans += now * Math.pow(r, i);
		}
		
		System.out.println(ans % M);
	}
}
