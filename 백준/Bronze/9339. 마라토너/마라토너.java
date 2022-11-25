import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int Bplayer = 0;
            int BT1 = 0;
            int BT2 = 0;
            int count = 0;
            int K = Integer.parseInt(br.readLine());
            int[] Splayer = new int[K];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < K; j++) {
                Splayer[j] = Integer.parseInt(st.nextToken());
            }
            int N = Integer.parseInt(br.readLine());
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                int playerNB = Integer.parseInt(st.nextToken());
                int T1 = Integer.parseInt(st.nextToken());
                int T2 = Integer.parseInt(st.nextToken());
                for (int l = 0; l < K; l++) {
                    if (Splayer[l] == playerNB) {
                        if (T1 != -1) {
                            if (T1 < 6) {
                                count++;
                            } else if (T1 == 6) {
                                if (T2 == 0) {
                                    count++;
                                }
                            }
                            if (Bplayer == 0) {
                                Bplayer = playerNB;
                                BT1 = T1;
                                BT2 = T2;
                            } else if (BT1 > T1) {
                                Bplayer = playerNB;
                                BT1 = T1;
                                BT2 = T2;
                            } else if (BT1 == T1) {
                                if (BT2 > T2) {
                                    Bplayer = playerNB;
                                    BT1 = T1;
                                    BT2 = T2;
                                }
                            }
                        }
                    }
                }
            }
            bw.write(String.valueOf(Bplayer) + " " + String.valueOf(count) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}