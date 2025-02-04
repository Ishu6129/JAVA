package Assignment_6;
import java.util.*;
public class vivekLovesArrayGames {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            System.out.println(maxScore(A, 0, N - 1));
        }
        scanner.close();
    }

    private static int maxScore(int[] A, int start, int end) {
        if (start >= end) return 0;

        int sumLeft = 0, sumRight = 0;
        for (int mid = start; mid < end; mid++) {
            sumLeft += A[mid];
            sumRight = 0;
            for (int j = mid + 1; j <= end; j++) {
                sumRight += A[j];
            }

            if (sumLeft == sumRight) {
                return 1 + Math.max(maxScore(A, start, mid), maxScore(A, mid + 1, end));
            }
        }
        return 0;
    }
}
