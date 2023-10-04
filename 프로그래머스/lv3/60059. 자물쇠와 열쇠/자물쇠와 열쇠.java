class Solution {
    public static int[][][] maps;

	public static boolean solution(int[][] key, int[][] lock) {

		int keyl = key.length;
		int lockl = lock.length;
		maps = new int[4][keyl][keyl];
		int[][] locks = new int[(keyl * 2) + lockl][(keyl * 2) + lockl];
		for (int i = keyl; i < keyl + lockl; i++) {
			for (int j = keyl; j < keyl + lockl; j++) {
				locks[i][j] = lock[i - keyl][j - keyl];
			}
		}
		makeMaps(key);

		for (int i = 0; i < maps.length; i++) {
			for (int j = 0; j < locks.length - keyl; j++) {
				for (int k = 0; k < locks.length - keyl; k++) {
					int[][] locksClone = new int[(keyl * 2) + lockl][(keyl * 2) + lockl];
					for (int c = 0; c < locks.length; c++) {
						locksClone[c] = locks[c].clone();
					}
					boolean check = makeLocks(i, j, k, locksClone, keyl, lockl);
					if (check) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private static boolean makeLocks(int i, int j, int k, int[][] locksClone, int keyl, int lockl) {
		int y = 0;
		for (int a = j; a < j + keyl; a++) {	
			int x = 0;
			for (int b = k; b < k + keyl; b++) {
				locksClone[a][b] += maps[i][y][x++];
			}
			y++;
		}
		for (int a = keyl; a < keyl + lockl; a++) {
			for (int b = keyl; b < keyl + lockl; b++) {
				if(locksClone[a][b] == 0 || locksClone[a][b] > 1)
					return false;
			}
		}
		return true;
	}

	private static void makeMaps(int[][] key) {
		int[][] keyClone = new int[key.length][key.length];
		for (int i = 0; i < keyClone.length; i++) {
			keyClone[i] = key[i].clone();
			maps[0][i] = key[i].clone();
		}

		for (int i = 1; i < 4; i++) {
			int[][] map = new int[key.length][key.length];
			for (int j = 0; j < key.length; j++) {
				for (int k = 0; k < key.length; k++) {
					map[j][k] = keyClone[key.length - 1 - k][j];
				}
			}
			for (int j = 0; j < key.length; j++) {
				maps[i][j] = map[j].clone();
				keyClone[j] = map[j].clone();
			}
		}
	}
}