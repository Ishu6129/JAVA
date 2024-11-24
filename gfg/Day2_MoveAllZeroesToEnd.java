package gfg;
import java.util.*;
public class Day2_MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] arr ={2,3,0,4,0};
        pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void pushZerosToEnd(int[] arr) {
        int count=0;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(!(arr[i]==0)){
                temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
    }
}
