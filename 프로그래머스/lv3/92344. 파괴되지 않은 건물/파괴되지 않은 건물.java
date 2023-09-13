class Solution {
    public static int solution(int[][] board, int[][] skill) {
		// 합 저장할 배열 생성 위에 한것 처럼 하면 (0,0) 부터 (1,1) 하면 x 가 2 y 가 2 에 저장을 해야되
		// 니까 +1 해서 배열 길이 한칸 늘리자
		int[][] map = new int[board.length + 1][board[0].length + 1];
		for (int i = 0; i < skill.length; i++) {
			int type = skill[i][0];
			int r1 = skill[i][1];
			int c1 = skill[i][2];
			int r2 = skill[i][3];
			int c2 = skill[i][4];
			int degree = skill[i][5];
			// 1이면 공격 이니 *-1
			if (type == 1) {
				degree = degree * -1;
			}
			// 시작 지점부터 끝 지점 +1에 degree 저장

			map[r1][c1] += degree;
			map[r1][c2 + 1] += degree * -1;
			map[r2 + 1][c1] += degree * -1;
			map[r2 + 1][c2 + 1] += degree;
		}
		// 나온값을 board 에 합한다 위 -> 아래 아래 -> 위
		// 그럼 x 만큼 가야지?
		for (int i = 0; i < map[0].length; i++) {
			for (int j = 0; j < map.length; j++) {
				// 이렇게 하면 상 하 부터 하잖아 그런데 상 하니까 0이 나올 수 있는 곳은
				// 맨 위 x 값 밖에 없어 그럼 j 가 0일때 처리 해주면 될듯?
				// 0 이 아니면 전 값이랑 합치면 됨
				if (j != 0) {
					map[j][i] = map[j][i] + map[j - 1][i];
				}
			}
		}
		int count = 0;
		// 위 아래 처리 됬으면 이제 좌 -> 우 처리 해줘야지
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (j != 0) {
					map[i][j] = map[i][j] + map[i][j - 1];
				}
			}
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] += map[i][j];
				if (board[i][j] > 0)
					count++;
			}
		}
		// 그리고 1 이상인것만 보면 됨 위에서 세줄까?
		return count;
	}
}