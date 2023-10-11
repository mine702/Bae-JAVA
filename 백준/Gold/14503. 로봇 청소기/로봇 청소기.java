import java.util.*;
import java.io.*;

public class Main {

	public static int[][] map;
	public static int answer = 0;
	public static int[][] locations = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());

		map = new int[N][M];

		for (int i = 0; i < map.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		cleanRoom(R, C, D);

		sb.append(answer);
		System.out.println(answer);
	}

	private static void cleanRoom(int R, int C, int D) {
		if (map[R][C] == 0) {
			answer++;
			map[R][C] = 2;
		}
		if (!blanksCheck(R, C)) {
			int offerD = D;

			if (offerD == 0)
				offerD = 2;
			else if (offerD == 1)
				offerD = 3;
			else if (offerD == 2)
				offerD = 0;
			else
				offerD = 1;

			if (reverse(R, C, offerD))
				cleanRoom(R + locations[offerD][0], C + locations[offerD][1], D);
			else
				return;
		} else {
			int offerD = D;
			for (int i = 0; i < 4; i++) {
				if (offerD == 0)
					offerD = 3;
				else
					offerD--;
				if (cleanCheck(R, C, offerD)) {
					cleanRoom(R + locations[offerD][0], C + locations[offerD][1], offerD);
					break;
				}
			}

		}
	}

	private static boolean reverse(int R, int C, int offerD) {
		int offerY = R + locations[offerD][0];
		int offerX = C + locations[offerD][1];
		if (offerY < 0 || offerX < 0 || offerY >= map.length || offerX >= map[0].length)
			return false;
		if (map[offerY][offerX] != 1)
			return true;
		return false;
	}

	private static boolean cleanCheck(int R, int C, int offerD) {
		int offerY = R + locations[offerD][0];
		int offerX = C + locations[offerD][1];
		if (offerY < 0 || offerX < 0 || offerY >= map.length || offerX >= map[0].length)
			return false;
		if (map[offerY][offerX] == 0)
			return true;
		return false;
	}

	private static boolean blanksCheck(int r, int c) {
		for (int i = 0; i < locations.length; i++) {
			int offerY = r + locations[i][0];
			int offerX = c + locations[i][1];
			if (offerY < 0 || offerX < 0 || offerY >= map.length || offerX >= map[0].length)
				continue;
			if (map[offerY][offerX] == 0)
				return true;
		}
		return false;
	}
}
