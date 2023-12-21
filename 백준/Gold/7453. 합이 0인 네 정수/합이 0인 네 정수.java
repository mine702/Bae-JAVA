import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N], B = new int[N], C = new int[N], D = new int[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			A[i] = Integer.parseInt(st.nextToken());
			B[i] = Integer.parseInt(st.nextToken());
			C[i] = Integer.parseInt(st.nextToken());
			D[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] CD = new int[N*N];
		int idx = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				CD[idx++] = C[i] + D[j];
			}
		}
		
		Arrays.sort(CD);
		
		
		
		long ans = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int temp = A[i] + B[j];
				int upper = upperBound(-temp, CD);
				int lower = lowerBound(-temp, CD);
				ans += (upper - lower);
			}
		}
		System.out.println(ans);
	}
	
	
	static int upperBound(int key, int[] arr) {
		int start = 0, end = arr.length-1;
		while (start <= end) {
			int mid = (start + end)/2;
			if (arr[mid] > key) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
 		}
		return end;
	}
	
	static int lowerBound(int key, int[] arr) {
		int start = 0, end = arr.length-1;
		while (start <= end) {
			int mid = (start + end)/2;
			if (arr[mid] >= key) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
 		}
		return end;
	}
}