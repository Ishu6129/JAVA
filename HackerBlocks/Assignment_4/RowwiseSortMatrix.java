package As4;
import java.util.*;
public class RowwiseSortMatrix {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            sort(arr[i]);
        }

        display(arr);
    }

    public static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            insertLastElement(arr,i);
        }
    }
    public static void insertLastElement(int[] arr,int i){
        int item=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>item){
            arr[j+1]=arr[j];
            arr[j]=item;
            j--;
        }
        arr[j + 1] = item;
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}