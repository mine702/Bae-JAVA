class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int avg = 1;
        for(int i = 0 ; i < num_list.length; i++){
            avg *= num_list[i];
            sum += num_list[i];
        }
        
        if(sum*sum > avg)
            answer = 1;
        else
            answer = 0;
        return answer;
    }
}