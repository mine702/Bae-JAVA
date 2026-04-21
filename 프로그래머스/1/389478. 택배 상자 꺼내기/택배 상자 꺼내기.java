class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int[][] boxes = new int[n / w + 2][w];
        boolean array = true;
        
        int index = 1;
        for(int i = 0 ; i < boxes.length; i++){
            if(array){
                for(int j = 0; j < boxes[i].length; j++){
                    if(index == n + 1)
                        continue;
                    boxes[i][j] = index++;
                }
                array = !array; 
            } else {
                for(int j = boxes[i].length - 1; j >= 0; j--){
                    if(index == n + 1)
                        continue;
                    boxes[i][j] = index++;
                }
                array = !array; 
            }
        }
        
        boolean flag = false;
        
        for(int i = 0 ; i < boxes.length; i++){
            if(flag)
                break;
            
            for(int j = 0 ; j < boxes[i].length; j++){
                if(flag)
                    break;
                
                if(boxes[i][j] == num){
                    for(int k = i; k < boxes.length; k++){
                        answer++;
                        if(boxes[k][j] == 0){
                            answer--;
                            flag = true;                            
                        }
                    }              
                }
            }
        }
        return answer;
    }
}