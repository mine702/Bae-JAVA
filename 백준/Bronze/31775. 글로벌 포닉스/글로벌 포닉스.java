import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = new String[3];
        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.nextLine();
        }

        boolean isGlobal = false;
        boolean lFound = false;
        boolean kFound = false;
        boolean pFound = false;

        for (String s : strings) {
            if (s.startsWith("l")) {
                lFound = true;
            } else if (s.startsWith("k")) {
                kFound = true;
            } else if (s.startsWith("p")) {
                pFound = true;
            }
        }

        if (lFound && kFound && pFound) {
            isGlobal = true;
        }

        if (isGlobal) {
            System.out.println("GLOBAL");
        } else {
            System.out.println("PONIX");
        }

        scanner.close();
    }
}
