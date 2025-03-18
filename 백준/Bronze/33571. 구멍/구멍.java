import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();

        Map<Character, Integer> holeMap = new HashMap<>();
        String oneHole = "ADOPQRabdegopq";
        String twoHoles = "B";

        for (char c = 'A'; c <= 'Z'; c++) holeMap.put(c, 0);
        for (char c = 'a'; c <= 'z'; c++) holeMap.put(c, 0);

        for (char c : oneHole.toCharArray()) holeMap.put(c, 1);
        
        for (char c : twoHoles.toCharArray()) holeMap.put(c, 2);
        
        holeMap.put('@', 1);

        int holeCount = 0;
        for (char c : S.toCharArray()) {
            holeCount += holeMap.getOrDefault(c, 0);
        }

        System.out.println(holeCount);
    }
}
