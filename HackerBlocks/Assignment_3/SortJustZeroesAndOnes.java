import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int t=n;
        while(n>0){
            arr[t-n]=sc.nextInt();
            n--;
        }
        sort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void sort(int[] arr){
        for (int i=1;i<arr.length;i++){
            for (int j=0;j<arr.length-i;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}