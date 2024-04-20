import java.util.*;
import java.io.*;
 
public class Main {
    static int N, K;
    static ArrayList<Node> list = new ArrayList<>();
    static int endPoint = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken()); 
        while(N --> 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());
            
            list.add(new Node(num, gold, silver, bronze, 0));
        }
        
        Collections.sort(list);
        list.get(0).rank = 1;  
        for(int i = 1 ; i < list.size() ; i++) {
            Node now = list.get(i);
            
            int prevG = list.get(i - 1).g;
            int prevS = list.get(i - 1).s;
            int prevB = list.get(i - 1).b;
            
            if(list.get(i).num == K) {
                endPoint = i;
            }
            
            if(now.g == prevG && now.s == prevS && now.b == prevB) {
                list.get(i).rank = list.get(i - 1).rank;
            }
            else {
                list.get(i).rank = i + 1;
            }
        }
        System.out.println(list.get(endPoint).rank);
    }
}
 
class Node implements Comparable<Node>{
    int num, g, s, b, rank;
    
    Node(int num, int g, int s, int b, int rank) {
        this.num = num;
        this.g = g;
        this.s = s;
        this.b = b;
        this.rank = rank;
    }
    
    @Override
    public int compareTo(Node n) {
        if(this.g == n.g) {
            if(this.s == n.s) {
                return n.b - this.b;
            }
            else {
                return n.s - this.s;
            }
        }
        else {
            return n.g - this.g;
        }
    }
}
