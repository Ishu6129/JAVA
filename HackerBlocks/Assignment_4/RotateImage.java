package As4;
import java.util.*;
public class RotateImage {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        rotate(arr);
    }
    public static void Display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void rotate(int[][] arr){
        int maxc=arr[0].length-1;
        int c=0;
        while(c<arr[0].length) {
            for (int i = 0; i <= arr.length-1; i++) {
                System.out.print(arr[i][maxc] + " ");
            }
            maxc--;
            System.out.println();
            c++;
        }
    }
}
