import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Balloon> queue = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] balloonLocation = new int[N];
        for (int i = 0; i < N; i++) {
            balloonLocation[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
        sb.append("1 "); 
        int moveValue = balloonLocation[0]; 

        for(int i = 1; i < N; i++){
            queue.add(new Balloon(i+1, balloonLocation[i]));
        }

        while(!queue.isEmpty()){
            if(moveValue > 0){
                for(int i = 1; i < moveValue; i++){
                    queue.add(queue.poll());
                }
                Balloon next = queue.poll();
                moveValue = next.numValue; 
                sb.append(next.index+" "); 
            }
            else{
                for(int i = 1; i < -moveValue; i++){
                    queue.addFirst(queue.pollLast());
                }
                Balloon next = queue.pollLast();
                moveValue = next.numValue;
                sb.append(next.index+" ");
            }

        }
        System.out.println(sb);
    }
}
class Balloon{
    int index;
    int numValue;

    public Balloon(int index, int numValue) {
        this.index = index;
        this.numValue = numValue;
    }
}