class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a == b && b == c){
            answer = (3 * a) * (3*(a*a)) * ( 3*(a*a*a));
        }else if((a == b && b != c) || (a == c && c != b) || ( b == c && c != a)){
            answer = (a + b + c) * ( (a * a) + (b * b) + (c * c));
        }else {
            answer = a + b + c;
        }
        return answer;
    }
}