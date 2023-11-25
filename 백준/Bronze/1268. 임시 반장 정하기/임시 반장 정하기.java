import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] table = new int[n][5];
		boolean[][] list = new boolean[n][n];
		
		for (int i = 0; i < n; i++) {
			String[] s = br.readLine().split(" ");
			for (int j = 0; j < s.length; j++) {
				table[i][j] = Integer.parseInt(s[j]);
			}
		}
		
		for (int i = 0; i < 5; i++) {
			ArrayList<Integer>[] temp = new ArrayList[10];

			for (int j = 0; j < n; j++) {
				if (temp[table[j][i]] == null) temp[table[j][i]] = new ArrayList<>();
				temp[table[j][i]].add(j);
			}
			
			for (int j = 0; j < n; j++) {
				int num = table[j][i];
				ArrayList<Integer> data = temp[num];
				for (int k = 0; k < data.size(); k++) {
					if (j == data.get(k)) continue;
					list[j][data.get(k)] = true;
				}
			}
		}
		
		int max = 0;
		int index = 0;
		for (int i = 0; i < n; i++) {
			int num = 0;
			for (int j = 0; j < n; j++) {
				if (list[i][j]) num++;
			}
			if (max < num) {
				max = num;
				index = i;
			}
		}
		
		System.out.println(index+1);
	}
}