import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Size of first array
            int m = scanner.nextInt(); // Size of second array

            int[] nums1 = new int[n];
            int[] nums2 = new int[m];

            // Reading the first array
            for (int i = 0; i < n; i++) {
                nums1[i] = scanner.nextInt();
            }

            // Reading the second array
            for (int i = 0; i < m; i++) {
                nums2[i] = scanner.nextInt();
            }

            // Calculate the maximum sum path
            long maxSumPath = findMaxSumPath(nums1, nums2);
            System.out.println(maxSumPath);
        }

        scanner.close();
    }

    private static long findMaxSumPath(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        long sum1 = 0, sum2 = 0, maxPathSum = 0;

        while (i < nums1.length && j < nums2.length) {
            // If elements are equal, take the maximum of the two sums
            if (nums1[i] < nums2[j]) {
                sum1 += nums1[i++];
            } else if (nums1[i] > nums2[j]) {
                sum2 += nums2[j++];
            } else {
                // When both elements are equal
                sum1 += nums1[i];
                sum2 += nums2[j];
                
                // Update the maxPathSum
                maxPathSum += Math.max(sum1, sum2);
                
                // Reset sums for the next path
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }
        // Add remaining elements of nums1
        while (i < nums1.length) {
            sum1 += nums1[i++];
        }
        
        // Add remaining elements of nums2
        while (j < nums2.length) {
            sum2 += nums2[j++];
        }
        
        // Add the maximum of the last sums to maxPathSum
        maxPathSum += Math.max(sum1, sum2);

        return maxPathSum;
    }
}
