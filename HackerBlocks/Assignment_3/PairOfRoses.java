import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] sm = new int[n][2];
        int k = 0;
        
        while (k < n) {
            int t = sc.nextInt();
            int[] arr = new int[t];
            for (int i = 0; i < t; i++) {
                arr[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            int minDiff = Integer.MAX_VALUE;
            for (int i = 0; i < t; i++) {
                for (int j = i + 1; j < t; j++) {
                    if (arr[i] + arr[j] == target) {
                        int diff = Math.abs(arr[i] - arr[j]);
                        if (diff < minDiff) {
                            minDiff = diff;
                            if (arr[i] < arr[j]) {
                                sm[k][0] = arr[i];
                                sm[k][1] = arr[j];
                            } else {
                                sm[k][0] = arr[j];
                                sm[k][1] = arr[i];
                            }
                        }
                    }
                }
            }
            k++;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Deepak should buy roses whose prices are " + sm[i][0] + " and " + sm[i][1] + ".");
            if (i < n - 1) {
                System.out.println();
            }
        }
    }
}
