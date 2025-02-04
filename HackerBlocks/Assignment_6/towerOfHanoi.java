package Assignment_6;
import java.util.*;
public class towerOfHanoi_ashr {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            solveHanoi(N, 'A', 'B', 'C');
        }
        public static void solveHanoi(int n, char source, char destination, char helper) {
            if (n == 0) {
                return;
            }

            solveHanoi(n - 1, source, helper, destination);
            System.out.println("Moving ring " + n + " from " + source + " to " + destination);

            solveHanoi(n - 1, helper, destination, source);

        }
    }

}
