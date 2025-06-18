class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = String.valueOf(a) + String.valueOf(b);
        String str2 = String.valueOf(b) + String.valueOf(a);
        if(Integer.parseInt(str1) > Integer.parseInt(str2)){
            answer = Integer.parseInt(str1);
        } else{
            answer = Integer.parseInt(str2);
        }
        return answer;
    }
}