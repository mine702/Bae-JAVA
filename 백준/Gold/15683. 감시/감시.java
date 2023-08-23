import java.io.*;
import java.util.*;

public class Main {

	public static int N, M;
	public static int[][] map;
	public static int ans;
	public static int[][] locations = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	public static ArrayList<CCTV> cctvs;

	public static class CCTV {
		int type;
		int[] location;

		public CCTV(int type, int[] location) {
			super();
			this.type = type;
			this.location = location;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		cctvs = new ArrayList<>();
		ArrayList<int[]> type5 = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int num = Integer.parseInt(st.nextToken());
				map[i][j] = num;
				if (num == 1 || num == 2 || num == 3 || num == 4)
					cctvs.add(new CCTV(num, new int[] { i, j }));
				else if (num == 5)
					type5.add(new int[] { i, j });
			}
		}

		for (int i = 0; i < type5.size(); i++) {

			int[] location = type5.get(i);
			int y = location[0];
			int x = location[1];

			for (int k = 0; k < locations.length; k++) {
				int offerY = y;
				int offerX = x;
				while (true) {
					offerY += locations[k][0];
					offerX += locations[k][1];
					if (offerY < 0 || offerY >= N || offerX < 0 || offerX >= M) {
						break;
					}
					if (map[offerY][offerX] != 0) {
						if (map[offerY][offerX] == 6)
							break;
					} else {
						map[offerY][offerX] = 7;
					}
				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 0)
					ans++;
			}
		}

		numberCount(0, 0, map);
		sb.append(ans);
		System.out.println(ans);
	}

	public static class searchSave {
		int[][] mapClone;

		public searchSave(int[][] mapClone) {
			super();
			this.mapClone = mapClone;
		}
	}

	private static void numberCount(int cnt, int start, int[][] CopyMap) {
		if (cnt == cctvs.size()) {
			int count = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (CopyMap[i][j] == 0)
						count++;
				}
			}
			ans = Math.min(ans, count);
			return;
		}
		for (int i = start; i < cctvs.size(); i++) {
			// 나온 카메라 좌표 값
			CCTV cctv = cctvs.get(i);
			int type = cctv.type;
			int y = cctv.location[0];
			int x = cctv.location[1];

			searchSave[] directions = new searchSave[4];

			for (int j = 0; j < locations.length; j++) {

				int[][] mapClone = new int[N][M];

				for (int k = 0; k < N; k++) {
					mapClone[k] = CopyMap[k].clone();
				}
				int offerY = y;
				int offerX = x;
				while (true) {
					offerY += locations[j][0];
					offerX += locations[j][1];
					if (offerY < 0 || offerY >= N || offerX < 0 || offerX >= M) {
						break;
					}
					if (CopyMap[offerY][offerX] != 0) {
						if (CopyMap[offerY][offerX] == 6)
							break;
					} else {
						mapClone[offerY][offerX] = 7;
					}
				}
				directions[j] = new searchSave(mapClone);
			}

			if (type == 1) {
				numberCount(cnt + 1, i + 1, directions[0].mapClone);
				numberCount(cnt + 1, i + 1, directions[1].mapClone);
				numberCount(cnt + 1, i + 1, directions[2].mapClone);
				numberCount(cnt + 1, i + 1, directions[3].mapClone);
			} else if (type == 2) {
				for (int k = 0; k < N; k++) {
					for (int l = 0; l < M; l++) {
						if (directions[1].mapClone[k][l] == 7)
							directions[0].mapClone[k][l] = directions[1].mapClone[k][l];
					}
				}
				numberCount(cnt + 1, i + 1, directions[0].mapClone);
				for (int k = 0; k < N; k++) {
					for (int l = 0; l < M; l++) {
						if (directions[3].mapClone[k][l] == 7)
							directions[2].mapClone[k][l] = directions[3].mapClone[k][l];
					}
				}
				numberCount(cnt + 1, i + 1, directions[2].mapClone);
			} else if (type == 3) {

				// 3번 복사
				int[][] mapClone = new int[N][M];

				for (int k = 0; k < N; k++) {
					mapClone[k] = directions[3].mapClone[k].clone();
				}
				for (int k = 0; k < N; k++) {
					for (int l = 0; l < M; l++) {
						if (directions[1].mapClone[k][l] == 7)
							directions[3].mapClone[k][l] = directions[1].mapClone[k][l];
					}
				}
				numberCount(cnt + 1, i + 1, directions[3].mapClone);
				for (int k = 0; k < N; k++) {
					for (int l = 0; l < M; l++) {
						if (directions[2].mapClone[k][l] == 7)
							directions[1].mapClone[k][l] = directions[2].mapClone[k][l];
					}
				}
				numberCount(cnt + 1, i + 1, directions[1].mapClone);
				for (int k = 0; k < N; k++) {
					for (int l = 0; l < M; l++) {
						if (directions[0].mapClone[k][l] == 7)
							directions[2].mapClone[k][l] = directions[0].mapClone[k][l];
					}
				}
				numberCount(cnt + 1, i + 1, directions[2].mapClone);
				for (int k = 0; k < N; k++) {
					for (int l = 0; l < M; l++) {
						if (mapClone[k][l] == 7)
							directions[0].mapClone[k][l] = mapClone[k][l];
					}
				}
				numberCount(cnt + 1, i + 1, directions[0].mapClone);
			} else {
				// 좌우
				int[][] mapClone1 = new int[N][M];
				// 상하
				int[][] mapClone2 = new int[N][M];

				for (int k = 0; k < N; k++) {
					mapClone1[k] = directions[2].mapClone[k].clone();
				}
				for (int k = 0; k < N; k++) {
					mapClone2[k] = directions[0].mapClone[k].clone();
				}
				for (int k = 0; k < N; k++) {
					for (int l = 0; l < M; l++) {
						if (directions[3].mapClone[k][l] == 7)
							mapClone1[k][l] = directions[3].mapClone[k][l];
					}
				}
				for (int k = 0; k < N; k++) {
					for (int l = 0; l < M; l++) {
						if (directions[1].mapClone[k][l] == 7)
							mapClone2[k][l] = directions[1].mapClone[k][l];
					}
				}
				for (int k = 0; k < N; k++) {
					for (int l = 0; l < M; l++) {
						if (mapClone1[k][l] == 7)
							directions[0].mapClone[k][l] = mapClone1[k][l];
					}
				}
				numberCount(cnt + 1, i + 1, directions[0].mapClone);
				for (int k = 0; k < N; k++) {
					for (int l = 0; l < M; l++) {
						if (mapClone1[k][l] == 7)
							directions[1].mapClone[k][l] = mapClone1[k][l];
					}
				}
				numberCount(cnt + 1, i + 1, directions[1].mapClone);
				for (int k = 0; k < N; k++) {
					for (int l = 0; l < M; l++) {
						if (mapClone2[k][l] == 7)
							directions[2].mapClone[k][l] = mapClone2[k][l];
					}
				}
				numberCount(cnt + 1, i + 1, directions[2].mapClone);
				for (int k = 0; k < N; k++) {
					for (int l = 0; l < M; l++) {
						if (mapClone2[k][l] == 7)
							directions[3].mapClone[k][l] = mapClone2[k][l];
					}
				}
				numberCount(cnt + 1, i + 1, directions[3].mapClone);
			}
		}
	}
}