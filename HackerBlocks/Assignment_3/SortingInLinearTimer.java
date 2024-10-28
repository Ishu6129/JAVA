import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }
    public static void sort(int[] arr){
        for(int i=0;i<arr.length;i++) {
            int idx = min_from_ith_index(arr, i);
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }
    public static int min_from_ith_index(int[] arr, int ind){
        int min=arr[ind];
        int index = ind;
        for (int i=ind+1;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
                index=i;
            }
        }
        return index;
    }
}
