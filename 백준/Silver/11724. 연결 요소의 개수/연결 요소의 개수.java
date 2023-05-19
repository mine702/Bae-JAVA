import java.io.*;
import java.util.*;

public class Main
{
	static ArrayList<ArrayList<Integer>> al;
	static Boolean[] bl;
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		al = new ArrayList<>();
		bl = new Boolean[N+1];
		for(int i = 0 ; i < N+1; i++) {
			al.add(new ArrayList<Integer>());
			bl[i] = false;
		}
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			al.get(a).add(b);
			al.get(b).add(a);
		}	
		int count = 0;
		for(int i = 1; i < N+1; i++) {
			if(bl[i] == false) {
				DFS(i);
				count++;
			}
		}
		sb.append(count);
		System.out.println(sb);
	}
	
	public static void DFS(int num) {
		if(bl[num] == true) {
			return;
		}else {
			bl[num] = true;
			for(int i = 0; i<al.get(num).size();i++) {
				int node = al.get(num).get(i);
				if(bl[node] == false) {
					DFS(node);
				}				
			}
		}
	}
}