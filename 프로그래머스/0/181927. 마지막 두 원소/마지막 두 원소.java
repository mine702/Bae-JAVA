class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        for(int i = 0 ; i < num_list.length; i++){
            if(i == num_list.length - 1){
                answer[i] = num_list[i];
                int num1 = num_list[i-1];
                int num2 = num_list[i];
                if(num1 < num2)
                    answer[i+1] = num2 - num1;
                else
                    answer[i+1] = num2 * 2;
            }else{
                answer[i] = num_list[i];
            }
        }
        return answer;
    }
}