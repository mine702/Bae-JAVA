import java.io.*;
import java.util.*;


class Data implements Comparable<Data>{
	private String school;
	private int sul;

	public String getSchool() {return school;}

	public Data(String school, int sul) {
		this.school = school;
		this.sul = sul;
	}

	@Override
	public int compareTo(Data o) {
		if(sul > o.sul) return 1;
		else if(sul < o.sul) return -1;
		else return 0;
	}
}

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int T = Integer.parseInt(br.readLine());
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < T ; i++) {
			final int N = Integer.parseInt(br.readLine());
			ArrayList<Data> list = new ArrayList<Data>();
			for(int j = 0; j < N ; j++) {
				String strtmp = br.readLine();
				String[] strArr = strtmp.split(" ");
				list.add(new Data(strArr[0], Integer.parseInt(strArr[1])));
			}
			
			Collections.sort(list);
			Data data = list.get(N-1);
			if(i<T-1)
				sb.append(data.getSchool()+"\n");
			else
				sb.append(data.getSchool());
		}
		System.out.println(sb);
	}
}