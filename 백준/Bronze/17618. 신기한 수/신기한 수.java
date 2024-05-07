import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int count=0;

        for(int i=1;i<=num;i++){
            int sum =0;
            int n=i;

            while(n!=0){
                sum+=n%10; 
                n=n/10; 
            }

            if(i%sum==0) count++;

        }
        System.out.println(count);
    }
}