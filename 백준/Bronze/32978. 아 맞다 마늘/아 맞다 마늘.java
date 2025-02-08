import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();  

        String[] ingredients = sc.nextLine().split(" ");

        String[] usedIngredients = sc.nextLine().split(" ");

        Set<String> ingredientSet = new HashSet<>(Arrays.asList(ingredients));

        for (String used : usedIngredients) {
            ingredientSet.remove(used);
        }

        System.out.println(ingredientSet.iterator().next());

        sc.close();
    }
}
