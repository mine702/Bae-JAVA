class Solution {
    
    public static int[][] dynamic;
    
    public int solution(int[][] triangle) {
        int answer = 0;
        for(int i = 1 ; i < triangle.length; i++){
            for(int j = 0; j < triangle[i].length; j++){
                int left = j - 1;
                int right = j;
                int max = 0;
                if(left >= 0){
                    int num = triangle[i][j] + triangle[i - 1][left];
                    if(max < num)
                        max = num;
                }
                
                if(right != triangle[i - 1].length){
                    int num = triangle[i][j] + triangle[i - 1][right];
                    if(max < num)
                        max = num;
                }
                
                triangle[i][j] = max;
            }
        }
        
        for(int i = 0; i < triangle[triangle.length - 1].length; i++){
            if(answer < triangle[triangle.length - 1][i])
                answer = triangle[triangle.length - 1][i];
        }
        return answer;
    }
}