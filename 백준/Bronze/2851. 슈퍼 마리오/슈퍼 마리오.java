import java.io.*;

class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int s = 0;
		int res=0;
		for(int i=0;i<10;i++) {
			int a = Integer.parseInt(br.readLine());
			if(s<100){
				s+=a;
				if(Math.abs(res-100)>Math.abs(s-100)) {
					res = s;
				}else if(Math.abs(res-100)==Math.abs(s-100)) {
					res = res>s? res:s;
				}
			}
		}
		System.out.println(res);
	}

}