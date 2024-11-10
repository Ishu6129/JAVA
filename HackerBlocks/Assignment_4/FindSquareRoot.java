package As4;
import java.util.*;
public class FindSquareRoot {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sqt(n));
    }
    public static long sqt(int n) {
        int low = 1;
        int high = n;
        int ans = 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long midSquared = (long) mid * mid;
            if (midSquared <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
