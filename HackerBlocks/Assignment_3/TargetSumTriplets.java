import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int k=0;k<n;k++){
            arr[k]=sc.nextInt();
        }
        int target=sc.nextInt();
        sort(arr);
        int i=0;
        while(i<n){
            int left=i+1;
            int right=n-1;
            int sum=0;
            while(left<right){
                sum=arr[i]+arr[left]+arr[right];
                if(sum==target){
                    System.out.println(arr[i]+", "+arr[left]+" and "+arr[right]);
                    left++;
                    right--;
                }
                if(sum>target){
                    right--;
                }
                else if(sum<target){
                    left++;
                }
            }
            i++;
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