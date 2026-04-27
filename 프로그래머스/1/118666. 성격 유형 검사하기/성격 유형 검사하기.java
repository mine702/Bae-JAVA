class Solution {
    
    public static int[][] scores = new int[4][2];
    
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        for(int i = 0 ; i < survey.length; i++){
            int score = 0;
            char winner;
            
            if(choices[i] == 4)
                continue;
            else if(choices[i] < 4){
                winner = survey[i].charAt(0);
            }else {
                winner = survey[i].charAt(1);
            }
            
            if (choices[i] == 1 || choices[i] == 7)
                score = 3;
            else if (choices[i] == 2 || choices[i] == 6)
                score = 2;
            else 
                score = 1;
            
            Scores(winner, score);                    
        }
        
        for(int i = 0; i < scores.length; i++){
            if(scores[i][0] >= scores[i][1]){
                if(i == 0)
                    answer += "R";
                else if(i == 1)
                    answer += "C";
                else if(i == 2)
                    answer += "J";
                else if(i == 3)
                    answer += "A";
            }else{
                if(i == 0)
                    answer += "T";
                else if(i == 1)
                    answer += "F";
                else if(i == 2)
                    answer += "M";
                else if(i == 3)
                    answer += "N";
            }
                
        }
        return answer;
    }
    
    public void Scores(char sur, int score){
        if(sur == 'R'){
            scores[0][0] += score;
        }else if(sur == 'T'){
            scores[0][1] += score;
        }else if(sur == 'C'){
            scores[1][0] += score;
        }else if(sur == 'F'){
            scores[1][1] += score;
        }else if(sur == 'J'){
            scores[2][0] += score;
        }else if(sur == 'M'){
            scores[2][1] += score;
        }else if(sur == 'A'){
            scores[3][0] += score;
        }else if(sur == 'N'){
            scores[3][1] += score;
        }
    }
}