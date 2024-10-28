import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
        while (test > 0) {
            int element = sc.nextInt();
            int[] arr = new int[element];
            for (int i = 0; i < element; i++) {
                arr[i] = sc.nextInt();
            }
            
            int maxCircularSum = getMaxCircularSum(arr);
            System.out.println(maxCircularSum);
            test--;
        }
        sc.close();
        
    }

    private static int getMaxCircularSum(int[] arr) {
        int n = arr.length;

        // Case 1: Maximum sum using standard Kadane's algorithm
        int maxKadane = kadane(arr);
        
        // Case 2: Maximum sum using circular property
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
            arr[i] = -arr[i]; // Invert the array for the second case
        }
        
        // The maximum sum of the inverted array
        int maxKadaneInverted = kadane(arr);
        
        // Maximum circular sum is total sum - (-maxKadaneInverted)
        int maxCircular = totalSum + maxKadaneInverted;

        // Return the maximum of both cases
        return Math.max(maxKadane, maxCircular);
    }

    private static int kadane(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for (int value : arr) {
            maxEndingHere += value;
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
        
        return maxSoFar;
    }
}
