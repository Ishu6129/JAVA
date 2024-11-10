package As4;
import java.util.*;
public class DiagonalTraversal_gem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int[] res = findDiagonalOrder(mat);
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
    public static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] res = new int[m * n];
        int row=0;
        int col=0;
        int d=0;
        int i=0;
        while (row < m && col < n) {
            res[i++] = mat[row][col];
            if (d % 2 == 0) {
                if (col == n - 1) {
                    row++;
                    d++;
                } else if (row == 0) {
                    col++;
                    d++;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == m - 1) {
                    col++;
                    d++;
                } else if (col == 0) {
                    row++;
                    d++;
                } else {
                    row++;
                    col--;
                }
            }
        }
        return res;
    }
}
