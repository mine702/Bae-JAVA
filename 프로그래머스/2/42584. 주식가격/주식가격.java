import java.util.*;

class Solution {
    public class Product{
        int index;
        int price;
        int count;

        Product(int index, int price, int count) {
            this.index = index;
            this.price = price;
            this.count = count;
        }
    }
    
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int index = 0;
        Queue<Product> queue = new LinkedList<>();

        for (int i = 0; i < prices.length; i++) {
            Product product = new Product(i, prices[i], 0);
            queue.add(product);
            int check = index;
            for (int j = 0; j < i - check; j++) {
                if (queue.isEmpty()) {
                    break;
                }

                Product products = queue.poll();
                products.count++;

                if (prices[i] < products.price) {
                    answer[products.index] = products.count;
                    index++;
                } else {
                    queue.add(products);
                }
            }
        }

        while (true) {
            if (queue.isEmpty())
                break;

            Product products = queue.poll();
            answer[products.index] = products.count;
        }
        return answer;
    }
}