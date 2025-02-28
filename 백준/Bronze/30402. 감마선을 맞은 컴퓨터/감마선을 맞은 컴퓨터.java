import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasWhite = false;
        boolean hasBlack = false;
        boolean hasGray = false;

        for (int i = 0; i < 15; i++) {
            String[] row = scanner.nextLine().split(" ");
            for (String pixel : row) {
                if (pixel.equals("w")) hasWhite = true;
                if (pixel.equals("b")) hasBlack = true;
                if (pixel.equals("g")) hasGray = true;
            }
        }
        scanner.close();
        
        if (hasWhite) {
            System.out.println("chunbae");
        } else if (hasBlack) {
            System.out.println("nabi");
        } else if (hasGray) {
            System.out.println("yeongcheol");
        }
    }
}
