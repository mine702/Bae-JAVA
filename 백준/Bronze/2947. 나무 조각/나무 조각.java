import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }
        for (int j=0;j<5;j++){
            for (int i = 0; i < 4; i++) {
                if(nums[i]>nums[i+1]){
                    int tmp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = tmp;
                    for (int num : nums) {
                        System.out.print(num+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}