import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] n = br.readLine().toCharArray();
		int half = n.length / 2;
		
		int sum1 = 0, sum2 = 0;
		for(int i = 0; i < n.length; i++) {
			if(i < half) {
				sum1 += n[i] - '0';
			}else {
				sum2 += n[i] - '0';
			}
		}
		if(sum1 == sum2) {
			System.out.println("LUCKY");
		}else {
			System.out.println("READY");
		}
		
		br.close();
	}

}