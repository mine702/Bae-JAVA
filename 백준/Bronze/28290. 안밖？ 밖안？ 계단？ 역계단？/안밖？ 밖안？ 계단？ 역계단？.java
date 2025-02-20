import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();
        
        if (S.equals("fdsajkl;") || S.equals("jkl;fdsa")) {
            System.out.println("in-out");
        } else if (S.equals("asdf;lkj") || S.equals(";lkjasdf")) {
            System.out.println("out-in");
        } else if (S.equals("asdfjkl;")) {
            System.out.println("stairs");
        } else if (S.equals(";lkjfdsa")) {
            System.out.println("reverse");
        } else {
            System.out.println("molu");
        }
    }
}