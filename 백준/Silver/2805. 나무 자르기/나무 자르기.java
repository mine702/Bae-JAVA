import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int MaxTree = 0;
        int MinTree = 0;
        st = new StringTokenizer(br.readLine());
        int[] trees = new int[N];
        for (int i = 0; i < N; i++) {
            int tree = Integer.parseInt(st.nextToken());
            if (MaxTree < tree) {
                MaxTree = tree;
            }
            trees[i] = tree;
        }

        while (MinTree < MaxTree) {
            int Mid = (MaxTree + MinTree) / 2;
            long sum = 0;
            for (int treeHeight : trees) {
                if (treeHeight - Mid > 0) {
                    sum += (treeHeight - Mid);
                }
            }
            if (sum < M) {
                MaxTree = Mid;
            } else {
                MinTree = Mid + 1;
            }
        }
        System.out.print(MinTree - 1);
    }
}