package gfg;
import java.util.Arrays;
public class Day3_ReverseAnArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseArray(int arr[]) {
        int i=0;
        int j=arr.length-1;
        int temp=0;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}

