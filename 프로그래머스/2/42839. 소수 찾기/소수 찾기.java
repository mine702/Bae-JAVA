import java.util.*;
import java.io.*;

class Solution {
    
    public char[] nums;
    public char[] output;
    public boolean[] isCheck;
    public Set<Integer> set;
    
    public int solution(String numbers) {
        int answer = 0;
        nums = new char[numbers.length()];
        isCheck = new boolean[numbers.length()];
        set = new HashSet<>();
        
        for(int i = 0 ; i < numbers.length(); i++){
            nums[i] = numbers.charAt(i);    
        }
        
        for(int i = 1 ; i <= numbers.length(); i++){
            output = new char[i];
            Permutation(0, i);
        }
        
        for(int n : set){
            if(isPrime(n))
                answer++;
        }
        return answer;
    }
    
    public void Permutation(int depth, int N){
        if(depth == N){
            String num = "";
            
            for(int i = 0; i < N; i++){
                num += output[i];
            }
            
            set.add(Integer.parseInt(num));
            return;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(isCheck[i])
                continue;
            isCheck[i] = true;
            output[depth] = nums[i];
            Permutation(depth + 1, N);
            isCheck[i] = false;
        }        
    }

    public boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false; 
        }
        return true; 
    }
}