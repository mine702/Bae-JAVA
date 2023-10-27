import java.util.*;
import java.io.*;

public class Main {
	/*
		 	만약 n이 4라고 하면 
	 		(1,2,3,4), (2,4,6,8), (3,6,9,12), (4,8,12,16)
	 		이렇게 존재하는 구구단이 나올것이다
	 		그런데 여기서 우리가 구해야될것은 B[K] = ? 이것이다
	 		위에것을 오름 차순으로 정렬하면
	 		1,2,2,3,3,4,4,4,6,6,7,7,8,12,12,16 이 나올것이고
	 		K가 7이라고 한다면 ? 은 4가 나올것이다
	 		이말은 B[7] = 4 이라는 소리이며
	 		반대로 해석할시 4보다 작거나 같은 원소의 개수가 최소 7개 
	 		반대로 해석할시 ?보다 작거나 같은 원소의 개수가 최소 K개
	 		라는 뜻이다 
	 		이 증명들을 토대로 이분탐색을 진행 하면된다
	 		X가 최소 1이 나올수 있고 최대로는 N * N이 나올 수 있다 
	 		그러면 우리는 X MID 값을 구하고 MID 값의 K번째를 구했을때
	 		나온 수가 우리가 구해야 될 K보다 작으면 X 를 보다 작게 변경 하면되고
	 		크다고 하면 X를 크게 하면 되는 것이다 같으면 반환 하고
	 		이해는 했지만 어떻게 K를 구할 것인가 
	 		이것은 구구단을 자세하게 알고 있어야 된다
	 		N이 4일때 나오는 경우의 수들이다
	 		(1,2,3,4), (2,4,6,8), (3,6,9,12), (4,8,12,16)
	 		이때 만약 X가 4이면 
	 		1단에서 4보다 작거나 같은 수 는 4개
	 		2단에서는 2개 
	 		3단에서는 1개
	 		4단에서도 1개이다
	 		다 더하면 4+2+1+1 이니 4보다 작거나 같은 수들은 8개라는 말이다
	 		이때 계산식은 간단하다 1단은 4/1 2단은 4/2 3단은 4/3 4단은 4/4 를
	 		하게 되면 된다
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		int start = 1;
		int end = K;
		while (start < end) {
			int mid = (start + end) / 2;
			int count = 0;
			for (int i = 1; i <= N; i++) {
				int cnt = mid / i;
				if (cnt >= N) {
					count += N;
				} else
					count += cnt;
			}
			if (count >= K)
				end = mid;
			else
				start = mid + 1;
		}
		sb.append(start);
		System.out.println(sb);
	}
}