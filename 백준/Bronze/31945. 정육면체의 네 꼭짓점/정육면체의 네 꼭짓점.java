import java.util.Scanner;

public class Main {
    // 8 points of the cube
    private static final int[][] POINTS = {
        {0, 0, 0}, {0, 0, 1}, {0, 1, 0}, {0, 1, 1},
        {1, 0, 0}, {1, 0, 1}, {1, 1, 0}, {1, 1, 1}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int[] points = new int[4];
            for (int i = 0; i < 4; i++) {
                points[i] = scanner.nextInt();
            }
            if (isSameFace(points)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }

    private static boolean isSameFace(int[] points) {
        // Get coordinates of the points
        int[][] coords = new int[4][3];
        for (int i = 0; i < 4; i++) {
            coords[i] = POINTS[points[i]];
        }

        // Check if all points have the same coordinate in two dimensions
        for (int dim = 0; dim < 3; dim++) {
            if (coords[0][dim] == coords[1][dim] &&
                coords[0][dim] == coords[2][dim] &&
                coords[0][dim] == coords[3][dim]) {
                return true;
            }
        }

        // Check pairs of dimensions
        for (int dim1 = 0; dim1 < 3; dim1++) {
            for (int dim2 = dim1 + 1; dim2 < 3; dim2++) {
                if ((coords[0][dim1] == coords[1][dim1] && coords[0][dim1] == coords[2][dim1] && coords[0][dim1] == coords[3][dim1]) &&
                    (coords[0][dim2] == coords[1][dim2] && coords[0][dim2] == coords[2][dim2] && coords[0][dim2] == coords[3][dim2])) {
                    return true;
                }
            }
        }

        return false;
    }
}
