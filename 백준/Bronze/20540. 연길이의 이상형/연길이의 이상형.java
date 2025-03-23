import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mbti = scanner.next();
        scanner.close();
        
        Map<Character, Character> opposite = new HashMap<>();
        opposite.put('E', 'I');
        opposite.put('I', 'E');
        opposite.put('S', 'N');
        opposite.put('N', 'S');
        opposite.put('T', 'F');
        opposite.put('F', 'T');
        opposite.put('J', 'P');
        opposite.put('P', 'J');
        
        // 이상형 MBTI 생성
        StringBuilder idealMbti = new StringBuilder();
        for (char c : mbti.toCharArray()) {
            idealMbti.append(opposite.get(c));
        }
        
        System.out.println(idealMbti.toString());
    }
}