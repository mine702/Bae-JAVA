import java.io.*;
import java.util.*;

class Main
{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();
		for(int i = 0 ; i < N ; i++) {
			int A = Integer.parseInt(br.readLine());
			priorityQueueLowest.add(A);
		}
		
		sb.append(gridy(priorityQueueLowest));
		System.out.println(sb);
	}
	
	public static int gridy(PriorityQueue<Integer> PQ) {
		int result = 0;
		while(true) {
			if(PQ.size() == 1) {
				break;
			}else {
				int a = PQ.poll();
				int b = PQ.poll();
				int sum = a + b;
				PQ.add(sum);
				result += sum;
			}
		}
		
		return result;
	}
}