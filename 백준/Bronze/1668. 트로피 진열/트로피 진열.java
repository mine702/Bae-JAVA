import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); 
		
		int[] trophy = new int[N];	
		int top = 0;	
		int left = 0;	
		int right = 0;	
		for(int i = 0; i<N; i++) {
			trophy[i] = Integer.parseInt(br.readLine());
			if(top <trophy[i]) {
				left = left+1;
				top = trophy[i];
			}
		}
		top = 0;
		for(int i = N-1; i>=0; i--) {
			if(top <trophy[i]) {
				right = right+1;
				top = trophy[i];
			}
		}
		bw.write(left+"\n"+right);
	
		bw.close();
		br.close();
	}
}
