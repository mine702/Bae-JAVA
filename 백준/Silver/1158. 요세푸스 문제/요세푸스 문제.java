import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 1; i <= N; i++) {
			deque.add(i);
		}
		int count = 0;
		while(true) {
			if(deque.isEmpty())
				break;
			int num = deque.poll();
			if(++count == K) {
				count = 0;
				al.add(num);
			}else {
				deque.addLast(num);
			}
		}
		sb.append("<");
		for(int result : al) {
			sb.append(result + ", ");
		}
		sb.delete(sb.length() - 2, sb.length());
		sb.append(">");
		System.out.println(sb);
	}
}
