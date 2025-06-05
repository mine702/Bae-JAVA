import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();  // 문자열 입력받기
        
        StringBuilder result = new StringBuilder();  // 결과를 저장할 StringBuilder
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // 대문자는 소문자로, 소문자는 대문자로 변환
            if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(Character.toLowerCase(ch));
            }
        }
        
        System.out.println(result.toString());  // 변환된 문자열 출력
    }
}
