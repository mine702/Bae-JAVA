import java.io.*;
import java.util.*;

public class Main {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args)throws IOException{
        int n = Integer.parseInt(br.readLine());
        List<Integer> numbers = new LinkedList<>();
        for(int i = 0 ; i < n; i++){
            numbers.add( Integer.parseInt(br.readLine()));
        }
        Collections.sort(numbers);
        for(int i = 0 ; i < n; i++){
            bw.write(numbers.get(i) + "\n");
        }
        bw.flush();
    }
}
