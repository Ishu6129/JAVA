package As4;

import java.util.*;

public class SpiralPrintAnticlockwise {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        spiral(arr);
    }
    public static void spiral(int[][] arr){
        int minc=0,minr=0,maxc=arr[0].length-1,maxr= arr.length-1;
        int t=arr.length*arr[0].length;
        int c=0;
        while(c<t) {
            for (int i = minr; i <= maxr && c<t; i++) {
                System.out.print(arr[i][minc] + ", ");
                c++;
            }
            minc++;
            for (int i = minc; i <= maxc && c<t; i++) {
                System.out.print(arr[maxr][i] + ", ");
                c++;
            }
            maxr--;
            for (int i = maxr; i >= minr && c<t; i--) {
                System.out.print(arr[i][maxc]+", ");
                c++;
            }
            maxc--;
            for (int i = maxc; i >= minc && c<t; i--) {
                System.out.print(arr[minr][i]+", ");
                c++;
            }
            minr++;
        }
        System.out.print("END");

    }
}
