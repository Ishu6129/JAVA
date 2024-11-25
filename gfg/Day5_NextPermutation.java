package gfg;

import java.util.*;

public class Day5_NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void nextPermutation(int[] arr) {
        int d=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                d=i;
                break;
            }
        }
        if (d==-1){
            Reverse(arr,0,arr.length-1);
            return;
        }
        for(int i=arr.length-1;i>d;i--){
            if(arr[i]>arr[d]){
                int temp=arr[i];
                arr[i]=arr[d];
                arr[d]=temp;
                break;
            }
        }
        Reverse(arr,d+1,arr.length-1);
    }
    public static void Reverse(int[] arr, int i,int j) {
        while(i<j) {
            int tem=arr[i];
            arr[i]=arr[j];
            arr[j]=tem;
            i++;
            j--;
        }
    }
}
