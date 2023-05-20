import java.io.*;
import java.util.*;

public class Main
{
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	static int[][] room;
	static boolean[][] bl;
	static StringBuilder sb = new StringBuilder();
	static int N;
	static int M;
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		room = new int[N][M];
		bl = new boolean[N][M];
		for(int i = 0; i < N; i++) {
			String line = br.readLine();
			for(int j = 0; j < M; j++) {
				int num = Integer.parseInt(line.substring(j, j+1));
				room[i][j] = num;
			}
		}
		BFS(0,0);
		sb.append(room[N-1][M-1]);
		System.out.println(sb);
	}
	
	public static void BFS(int x, int y) {
		Queue<int[]> q1 = new LinkedList<>();
		int[] start = {x, y};
		q1.add( start );
		bl[x][y] = true;
		while(!q1.isEmpty()) {
			int[] now = q1.poll();
			for(int i = 0; i < 4; i++) {
				int n1 = now[0] + dx[i];
				int n2 = now[1] + dy[i];
				if( n1 >= 0 && n2 >= 0 && n1 < N && n2 < M) {
					if(bl[n1][n2] == false && room[n1][n2] != 0) {						
						int[] go = {n1 , n2};
						q1.add(go);
						bl[n1][n2] = true;
						room[n1][n2] += room[now[0]][now[1]];
					}
				}
			}
		}
	}
}