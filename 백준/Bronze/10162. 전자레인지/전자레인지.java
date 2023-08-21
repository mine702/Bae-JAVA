import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// 입력 시 BufferedReader 출력시 StringBuilder
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		// 요리시간 T(초) 입력
		int T = Integer.parseInt(br.readLine());

		// A,B,C 개수 만큼 몇개의 버튼 눌러야되는지 저장할 배열 선언
		int[] nums = new int[3];

		// A 버튼 5분 300초 이니 T를 300으로 나누었을때 0이 아닐 경우
		// 배열 0번째에 T를 300으로 나누었을때 인자값을 저장하고 T에 300 나머지를 저장
		if (T / 300 > 0) {
			nums[0] = T / 300;
			T = T % 300;
		}

		// B 버튼 60초 T를 60으로 나누었을때 0이 아닐 경우
		// 배열 1번째에 T를 60으로 나누었을때 인자값을 저장하고 T에 60 나머지를 저장
		if (T / 60 > 0) {
			nums[1] = T / 60;
			T = T % 60;
		}

		// C 버튼 10초 T를 10으로 나누었을때 0이 아닐 경우
		// 배열 2번째에 T를 10으로 나누었을때 인자값을 저장하고 T에 10 나머지를 저장
		if (T / 10 > 0) {
			nums[2] = T / 10;
			T = T % 10;
		}

		// 만약 T가 0일 경우 제시된 3개의 버튼으로 T초를 맞출 수 있었으니 배열 출력
		// T가 0이 아닐경우 제시된 3개의 버튼으로 T초를 맞출 수 없으니 -1 출력
		if (T == 0) {
			for (int num : nums)
				sb.append(num + " ");
		} else
			sb.append(-1);

		System.out.println(sb);
	}

}
