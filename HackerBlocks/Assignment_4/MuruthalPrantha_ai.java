package As4;
import java.util.*;
public class MuruthalPrantha_ai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int L = sc.nextInt();
        int[] ranks = new int[L];

        for (int i = 0; i < L; i++) {
            ranks[i] = sc.nextInt();
        }

        System.out.println(minimumTimeToCookAllParanthas(P, ranks));
        sc.close();
    }

    private static int minimumTimeToCookAllParanthas(int P, int[] ranks) {
        int low = 1;
        int high = 1_000_000_000;
        int minTime = high;

        while (low <= high) {
            int midTime = low + (high - low) / 2;

            if (canCookAllParanthasInTime(P, ranks, midTime)) {
                minTime = midTime;
                high = midTime - 1;
            } else {
                low = midTime + 1;
            }
        }

        return minTime;
    }

    private static boolean canCookAllParanthasInTime(int P, int[] ranks, int timeLimit) {
        int totalParanthas = 0;

        for (int rank : ranks) {
            int time = 0;
            int paranthasByCook = 0;
            int multiplier = 1;

            while (time + multiplier * rank <= timeLimit) {
                time += multiplier * rank;
                paranthasByCook++;
                multiplier++;
            }

            totalParanthas += paranthasByCook;

            if (totalParanthas >= P) {
                return true;
            }
        }

        return totalParanthas >= P;
    }
}
