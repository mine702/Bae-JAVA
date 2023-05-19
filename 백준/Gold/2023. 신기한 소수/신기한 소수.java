import java.io.*;
import java.util.*;

public class Main
{
	static int N;
	static StringBuilder sb = new StringBuilder();
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());		
		
		DFS(2,1);
		DFS(3,1);
		DFS(5,1);
		DFS(7,1);
		
		System.out.println(sb);
	} 
	
	public static void DFS(int num, int s) {
		if(s==N) {
			if(isPrime(num)) {
				sb.append(num+"\n");
			}			
			return;
		}else {
			for(int i = 1; i < 10; i++) {
				if(i % 2 != 0) {
					if(isPrime(num*10 + i)) {
						DFS(num*10 + i, s + 1);
					}
				}
			}
		}
	}
	
	public static Boolean isPrime(int num) {
		if(num < 2) {
			return false;
		}else {
			for(int i = 2; i < num/2; i++) {
				if(num % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
}

