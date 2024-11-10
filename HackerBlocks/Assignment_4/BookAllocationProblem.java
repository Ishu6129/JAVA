package As4;
import java.util.*;
public class BookAllocationProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] pages = new int[n];
            for (int i = 0; i < n; i++) {
                pages[i] = sc.nextInt();
            }
            System.out.println(minimumPages(pages, n, m));
        }
        sc.close();
    }

    public static int minimumPages(int[] pages, int n, int m) {
        int low = pages[n - 1];
        int high = 0;
        for (int i = 0; i < n; i++) {
            high += pages[i];
        }

        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canAssign(pages, n, m, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    public static boolean canAssign(int[] pages, int n, int m, int maxPages) {
        int studentsRequired = 1;
        int currentPages = 0;

        for (int i = 0; i < n; i++) {
            if (currentPages + pages[i] > maxPages) {
                studentsRequired++;
                currentPages = pages[i];
                if (studentsRequired > m) {
                    return false;
                }
            } else {
                currentPages += pages[i];
            }
        }

        return true;
    }
}
