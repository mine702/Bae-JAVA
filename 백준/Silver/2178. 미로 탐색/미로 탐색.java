import java.io.*;
import java.util.*;

public class Main
{
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static int[][] arrs1;
	static boolean[][] bl;
	static int N,M;
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arrs1 = new int[N][M];
		bl = new boolean[N][M];
		for(int i = 0; i < N ; i++) {
			String line = br.readLine();
			for(int j = 0 ; j < M ; j++) {
				arrs1[i][j] = Integer.parseInt(line.substring(j, j+1));
			}
		}
		BFS(0,0);
		sb.append(arrs1[N-1][M-1]);
		System.out.println(sb);
	}
	
	public static void BFS(int i , int j) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {i,j});
		bl[i][j] = true;
		while(!queue.isEmpty()) {
			int now[] = queue.poll();
			for(int k = 0; k < 4; k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				if(x >= 0 && y >= 0 && x < N && y < M) {
					if(arrs1[x][y] != 0 && !bl[x][y]) {
						bl[x][y] = true;
						arrs1[x][y] = arrs1[now[0]][now[1]] + 1;
						queue.add(new int[] {x,y});
					}
				}
			}
		}
	}
}