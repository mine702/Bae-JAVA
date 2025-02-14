import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        String stationName;
        String subStationName = "-";
        
        // 괄호가 있는지 확인
        int openIdx = input.indexOf("(");
        int closeIdx = input.indexOf(")");
        
        if (openIdx != -1 && closeIdx != -1 && openIdx < closeIdx) {
            stationName = input.substring(0, openIdx).trim();
            subStationName = input.substring(openIdx + 1, closeIdx).trim();
        } else {
            stationName = input.trim();
        }
        
        System.out.println(stationName);
        System.out.println(subStationName);
    }
}