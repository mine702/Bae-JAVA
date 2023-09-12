class Solution {
    private static final int[] dx = { 1, 0, 0, -1};
    private static final int[] dy = { 0, -1, 1, 0};
    private static final String[] term = {"d", "l", "r", "u"};
    private static int mapX, mapY;
    private static int endX, endY;
    private String tempAnswer = "";

    public boolean dfs(int x, int y, int k, String str, int diff) {
        if(k==0 && diff==0){
            tempAnswer = str;
            return true;
        }
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if(nextX >=0 && nextY >= 0 && nextX < mapX && nextY < mapY && diff<=k) {
                if ((diff % 2 == 0 && k % 2 ==0) || (diff % 2 == 1 && k % 2 ==1)) {
                    if (dfs(nextX, nextY, k - 1, str + term[i], Math.abs(nextX - endX) + Math.abs(nextY - endY))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public String solution(int n, int m, int x, int y, int r, int c, int k) {
        String answer;
        mapX = n;
        mapY = m;
        endX = r-1;
        endY = c-1;
        int diff = Math.abs((r-1)-(x-1)) + Math.abs((c-1)-(y-1));
        dfs(x-1, y-1, k, "", diff);
        if(tempAnswer.equals("")){
            answer = "impossible";
        } else {
            answer = tempAnswer;
        }
        return answer;
    }
}