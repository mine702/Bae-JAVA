import java.util.Scanner;

public class Main {
    
    static int[] parents;
    static int N;
    static int[] people;
    static int[][] map;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        parents = new int[N + 1];
        isSeleceted = new boolean[N + 1];
        people = new int[N + 1];
        
        for(int i = 1 ; i <= N ; i++) {
            people[i] = sc.nextInt();
        }
        
        map = new int[N + 1][N + 1];
        for(int i = 1 ; i <= N; i++) {
            int num = sc.nextInt();
            for(int j = 0 ; j < num ; j++) {
                // 현재 노드와 연결된 노드들 체크해주기
                map[i][sc.nextInt()] = 1;
            }
        }
        부분집합(0);
        if(ans == MAX) System.out.println(-1);
        else System.out.println(ans);
    }
    
    static boolean[] isSeleceted;
    static int MAX = 987654321;
    static int ans = MAX;
    static int[][] copyMap;
    static boolean[] redBlue;
    
    static void 부분집합(int cnt) {
        if(cnt == N) {
            int cntRed = 0;
            int cntBlue = 0;
            int r = 0, b= 0;
            redBlue = new boolean[N + 1];
            
            for(int i = 1 ; i <= N; i++) {
                // 색 1 개수
                if(isSeleceted[i]) {
                    cntRed += people[i];
                    // 빨강은 true, 파랑은 false로 저장
                    redBlue[i] = true;
                    // 어느 노드든 상관없으므로 그냥 마지막 빨강으로 체크된 노드를 채택
                    r = i;
                } 
                // 색 2 개수
                else {
                    cntBlue+= people[i];
                    redBlue[i] = false;
                    b = i;
                }
            }
            
            // 각 색별로 가능한 방법인지 확인해주기
            visited = new boolean[N + 1];
            dfs(r);
            dfs(b);
            
            // 가지치기..?
            if(Math.abs(cntRed - cntBlue) > ans) return;
            
            for(int i = 1 ; i <= N; i++) {
            	// 방문하지 못한곳, 즉 끊킨 부분이 있으면 -1후 종료
            	if(!visited[i]) {
            		// 하나도 되는 방법이 없을때만 답이 -1
            		if(ans == MAX) ans = MAX;
            		return;
            	} 
            }
            
            // 가능한 방법일 때       
            ans = Math.min(ans, Math.abs(cntRed - cntBlue));
            // 한 색이 하나도 없을때는 안됨
            if((r == 0 || b == 0) && ans == MAX) {
            	ans = MAX;
            	return;
            }
            return;
        }
        isSeleceted[cnt] = true;
        부분집합(cnt + 1);
        isSeleceted[cnt] = false;
        부분집합(cnt + 1);
    }
    
    static boolean[] visited;
    static void dfs(int start) {
        
        visited[start] = true;
        for(int i = 1 ; i <= N; i++) {
            if(map[start][i] == 1 && !visited[i] && (redBlue[start] == redBlue[i])) {
            	dfs(i);
            }
        }
    }
}