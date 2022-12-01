
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int Z = Integer.parseInt(st.nextToken());

        long cnt = 0;

        while (X >= 3 || Y >= 3 || Z >= 3) {
            if (A >= X) {
                cnt += X;
                A -= X;
                X = 0;
            } else {
                cnt += A;
                X -= A;
                A = 0;
            }

            if (X > 3) {
                Y += X / 3;
                X %= 3;
            }

            if (B >= Y) {
                cnt += Y;
                B -= Y;
                Y = 0;
            } else {
                cnt += B;
                Y -= B;
                B = 0;
            }

            if (Y > 3) {
                Z += Y / 3;
                Y %= 3;
            }

            if (C >= Z) {
                cnt += Z;
                C -= Z;
                Z = 0;
            } else {
                cnt += C;
                Z -= C;
                C = 0;
            }

            if (Z > 3) {
                X += Z / 3;
                Z %= 3;
            }

            if (A == 0 && B == 0 && C == 0) {
                break;
            }
        }

        if (A >= X) {
            cnt += X;
            A -= X;
            X = 0;
        } else {
            cnt += A;
            X -= A;
            A = 0;
        }

        if (B >= Y) {
            cnt += Y;
            B -= Y;
            Y = 0;
        } else {
            cnt += B;
            Y -= B;
            B = 0;
        }

        if (C >= Z) {
            cnt += Z;
            C -= Z;
            Z = 0;
        } else {
            cnt += C;
            Z -= C;
            C = 0;
        }

        System.out.println(cnt);
    }
}