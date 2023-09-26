import java.util.*;
import java.io.*;

public class Main {

	public static ArrayList<Integer>[] resultMap = new ArrayList[9];
	public static boolean isCheck = true;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		ArrayList<Integer>[] map = new ArrayList[9];
		for (int i = 0; i < 9; i++) {
			map[i] = new ArrayList<>();
			resultMap[i] = new ArrayList<>();
			String nums = br.readLine();
			for (int j = 0; j < 9; j++) {
				map[i].add(nums.charAt(j) - '0');
			}
		}
		BFS(map);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sb.append(resultMap[i].get(j));
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	@SuppressWarnings("unchecked")
	public static void BFS(ArrayList<Integer>[] map) {
		ArrayList<Integer>[] mapClone = new ArrayList[9];
		for (int i = 0; i < 9; i++) {
			mapClone[i] = (ArrayList<Integer>) map[i].clone();
		}

		for (int i = 0; i < 9; i++) {
			if (isCheck)
				for (int j = 0; j < 9; j++) {
					if (isCheck)
						if (mapClone[i].get(j) == 0) {
							// 검사 로직 행과 열과 몇 인지
							ArrayList<Integer> list = Intersection(mapClone, i, j);
							for (int k = 0; k < list.size(); k++) {
								mapClone[i].set(j, list.get(k));
								BFS(mapClone);
							}
							return;
						}
				}
		}
		if (isCheck) {
			isCheck = false;
			resultMap = mapClone.clone();
		}
	}

	private static ArrayList<Integer> Intersection(ArrayList<Integer>[] mapClone, int i, int j) {
		// 행 구하기
		ArrayList<Integer> rList = new ArrayList<>();
		ArrayList<Integer> lList = new ArrayList<>();
		ArrayList<Integer> mList = new ArrayList<>();

		for (int a = 1; a < 10; a++) {
			rList.add(a);
			lList.add(a);
			mList.add(a);
		}
		rList.removeAll(mapClone[i]);
		ArrayList<Integer> result = new ArrayList<>();
		for (int a = 0; a < 9; a++) {
			result.add(mapClone[a].get(j));
		}
		lList.removeAll(result);
		result = new ArrayList<>();
		int[] y = new int[3];
		int[] x = new int[3];
		if (0 <= i && i < 3) {
			y[0] = 0;
			y[1] = 1;
			y[2] = 2;
		} else if (3 <= i && i < 6) {
			y[0] = 3;
			y[1] = 4;
			y[2] = 5;
		} else if (6 <= i && i < 9) {
			y[0] = 6;
			y[1] = 7;
			y[2] = 8;
		}

		if (0 <= j && j < 3) {
			x[0] = 0;
			x[1] = 1;
			x[2] = 2;
		} else if (3 <= j && j < 6) {
			x[0] = 3;
			x[1] = 4;
			x[2] = 5;
		} else if (6 <= j && j < 9) {
			x[0] = 6;
			x[1] = 7;
			x[2] = 8;
		}

		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				result.add(mapClone[y[a]].get(x[b]));
			}
		}

		mList.removeAll(result);
		rList.retainAll(mList);
		rList.retainAll(lList);
		return rList;
	}
}
