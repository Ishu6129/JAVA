package As4;
import java.util.*;
public class KthRooot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            long n = sc.nextLong();
            int k = sc.nextInt();
            System.out.println(kthRoot(n, k));
            t--;
        }
        sc.close();
    }

    public static long kthRoot(long n, int k) {
        long lo = 1;
        long hi = n;
        long ans = 1;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (power(mid, k) <= n) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    public static long power(long x, int k) {
        long result = 1;
        for (int i = 0; i < k; i++) {
            if (result > Long.MAX_VALUE / x) {
                return Long.MAX_VALUE;
            }
            result *= x;
        }
        return result;
    }
}
