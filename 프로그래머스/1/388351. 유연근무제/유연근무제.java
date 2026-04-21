class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = schedules.length;
        for(int i = 0; i < schedules.length; i++){
            int time = schedules[i] / 100;
            int minute = schedules[i] % 100;
            
            if(minute + 10 > 60){
                time += 1;
                minute = (minute + 10) % 10;
            } else if( minute + 10 == 60 ){
                time += 1;
                minute = 0;
            } else {
                minute += 10;
            }
            
            int times = time * 100 + minute;
            int saturday = -1;
            int sunday = -1;
            
            switch(startday){
                case 1 : saturday = 5; sunday = 6; break;
                case 2 : saturday = 4; sunday = 5; break;
                case 3 : saturday = 3; sunday = 4; break;
                case 4 : saturday = 2; sunday = 3; break;
                case 5 : saturday = 1; sunday = 2; break;
                case 6 : saturday = 0; sunday = 1; break;
                case 7 : saturday = 6; sunday = 0; break;
            }
            
            boolean isCheck = false;
            
            for(int j = 0 ; j < timelogs[0].length; j++){
                if(j == saturday || j == sunday || isCheck)
                    continue;
                
                if(timelogs[i][j] > times)
                    isCheck = true;
            }
            
            if(isCheck)
                answer--;
                
        }
        return answer;
    }
}