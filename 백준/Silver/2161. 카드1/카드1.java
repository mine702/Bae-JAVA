import java.util.*;

public class Main {
    public static void main(String[]args){


        Scanner scan=new Scanner(System.in);

        int n= scan.nextInt();

        Queue<Integer> que=new LinkedList();

        for(int i=1;i<=n;i++){
            que.add(i);
        }
        while(que.size()!=1){
            int s=que.poll();
            System.out.print(s+" ");
            int qu=que.poll();
            que.add(qu);
        }
        System.out.print(que.poll());


    }
}