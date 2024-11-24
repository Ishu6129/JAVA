package gfg;

import java.util.*;

public class Day4_RotateArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int d=2;
        rotateArr(arr,d);
        System.out.println(Arrays.toString(arr));

    }
    public static void rotateArr(int arr[], int d) {
        Rotate(arr,d);
    }
    public static void Rotate(int[] arr, int d) {
        int n=arr.length;
        d=d%n;
        Reverse(arr,0,d-1);
        Reverse(arr,d,n-1);
        Reverse(arr,0,n-1);
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

