package As4;
import java.util.*;
public class PaintersPartitionProblem_ai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] boards = new int[N];

        for (int i = 0; i < N; i++) {
            boards[i] = sc.nextInt();
        }

        System.out.println(minimumTime(K, N, boards));
        sc.close();
    }

    public static int minimumTime(int K, int N, int[] boards) {
        int low = 0, high = 0;

        for (int i = 0; i < N; i++) {
            low = Math.max(low, boards[i]);
            high += boards[i];
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canPaint(boards, K, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static boolean canPaint(int[] boards, int K, int maxTime) {
        int paintersRequired = 1;
        int currentTime = 0;

        for (int board : boards) {
            if (currentTime + board > maxTime) {
                paintersRequired++;
                currentTime = board;
                if (paintersRequired > K) {
                    return false;
                }
            } else {
                currentTime += board;
            }
        }

        return true;
    }
}
