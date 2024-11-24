package gfg;
public class Day1_SecondLargest {
    public static void main(String[] args) {
        int[] arr ={2,3,0,4,0};
        int second=getSecondLargest(arr);
        System.out.println(second);

    }

    public static int getSecondLargest(int[] arr) {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        if(arr.length==2 && arr[0]==arr[1]){
            return -1;
        }
        for(int i : arr){
            if(i>first){
                second=first;
                first = i;
            }
            if(i>second && !(i==first)){
                second=i;
            }
        }
        if(second == Integer.MIN_VALUE){
            return -1;
        }
        else{
            return second;
        }
    }
}
