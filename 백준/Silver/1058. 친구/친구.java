import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int N;
	static char[][] friend;
	static boolean[] visited;
	static int maxCount = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		friend = new char[N][N];
		for (int i = 0; i < N; i++) {
			friend[i] = br.readLine().toCharArray();
		}
		
		for (int i = 0; i < N; i++) {
			
			visited = new boolean[N];
			visited[i] = true;

			Queue<Integer> q = new LinkedList<>();
			q.add(i);
			
			int depth = 0;
			int count = 0;

			while (depth < 2) { 
				
				int size = q.size();
				for (int j = 0; j < size; j++) {
					
					int n = q.poll();
					
					for (int k = 0; k < N; k++) {
						
						if (friend[n][k] == 'Y' && !visited[k]) {
							q.add(k);
							count++;
							visited[k] = true;
						}
					}
				}
				depth++;
			}
			if(maxCount < count) {
				maxCount = count;
			}
		}

		System.out.println(maxCount);

	}

}