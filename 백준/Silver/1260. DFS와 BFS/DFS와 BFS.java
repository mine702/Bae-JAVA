import java.io.*;
import java.util.*;

public class Main
{
	static ArrayList<ArrayList<Integer>> al;
	static Boolean[] bl1;
	static Boolean[] bl2;
	static StringBuffer sb = new StringBuffer();
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;		
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int St = Integer.parseInt(st.nextToken());
		
		al = new ArrayList<>();
		bl1 = new Boolean[N+1];
		bl2 = new Boolean[N+1];
		for(int i = 0; i < N+1 ; i++) {
			al.add(new ArrayList<Integer>());
			bl1[i] = false;
			bl2[i] = false;
		}
		
		for(int i = 0; i < M ; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			al.get(a).add(b);
			al.get(b).add(a);			
		}
		for(int i = 1; i < N+1 ; i++) {
			Collections.sort(al.get(i));
		}
		DFS(St);	
		sb.append("\n");
		
		BFS(St , al);
		sb.append("\n");
		System.out.println(sb);
	} 
	
	public static void DFS(int num) {
		if(bl1[num] == true) {
			return;
		}else {
			sb.append(num + " ");
			bl1[num] = true;
			for(int i = 0; i < al.get(num).size(); i++) {
				int a = al.get(num).get(i);
				if(bl1[a] == false) {
					DFS(a);
				}
			}
		}
		
	}
	public static void BFS(int num , ArrayList<ArrayList<Integer>> al) {
		Queue<Integer> q1 = new LinkedList<>();
		q1.add(num);
		bl2[num] = true;
		while(true) {
			if(q1.isEmpty() == true) {
				break;
			}
			int a = q1.peek();
			for(int i = 0 ; i < al.get(a).size(); i++) {
				int b = al.get(a).get(i);
				if(bl2[b] == false) {
					bl2[b] = true;
					q1.add(b);
				}
			}
			sb.append(q1.peek()+" ");
			q1.poll();			
		}
	}
}