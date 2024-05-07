import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        for( int i = 1; i <= n; i++ ){
            String str = Integer.toString(i);
            String[] arr = str.split(""); 
            int sum = 0;
            for( int j = 0; j < arr.length; j++ ){
                sum+=Integer.parseInt(arr[j]); 
            }

            if( i % sum == 0 ) count++; 
        }

        System.out.println(count);

    }

}