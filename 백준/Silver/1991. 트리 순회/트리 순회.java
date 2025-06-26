import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static class Node {
        int left;
        int right;

        public Node(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }

    public static Node[] graph;
    public static List<Integer> pre = new ArrayList<>();
    public static List<Integer> in = new ArrayList<>();
    public static List<Integer> post = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        graph = new Node[91];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int num1 = (int) st.nextToken().charAt(0);
            int num2 = (int) st.nextToken().charAt(0);
            int num3 = (int) st.nextToken().charAt(0);

            graph[num1] = new Node(num2, num3);
        }
        preorder(65);
        inorder(65);
        postorder(65);

        for (int n : pre)
            sb.append((char) n);

        sb.append("\n");

        for (int n : in)
            sb.append((char) n);

        sb.append("\n");

        for (int n : post)
            sb.append((char) n);

        System.out.println(sb);
    }

    public static void preorder(int start) {
        Node node = graph[start];
        pre.add(start);

        if (node.left != 46)
            preorder(node.left);

        if (node.right != 46)
            preorder(node.right);
    }

    public static void inorder(int start) {
        Node node = graph[start];

        if (node.left != 46) {
            inorder(node.left);
        }

        in.add(start);

        if (node.right != 46)
            inorder(node.right);

    }

    public static void postorder(int start) {
        Node node = graph[start];

        if (node.left != 46) {
            postorder(node.left);
        }

        if (node.right != 46)
            postorder(node.right);

        post.add(start);
    }
}