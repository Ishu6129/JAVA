package Assignment_6;
import java.util.*;
public class splitArray {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        List<Integer>part1=new ArrayList<>();
        List<Integer>part2=new ArrayList<>();
        printSplit(arr,0,part1,part2,0,0);
        System.out.println(countSplit(arr,0,part1,part2,0,0));
    }
    public static void printSplit(int[] arr,int idx,List<Integer>part1,List<Integer>part2,int s1,int s2)
    {
        if(idx==arr.length)
        {
            if(s1==s2)
            {
                for(int num:part1)
                {
                    System.out.print(num+" ");
                }
                System.out.print("and ");
                for(int num:part2)
                {
                    System.out.print(num+" ");
                }
                System.out.println();
            }
            return;
        }
        part1.add(arr[idx]);
        printSplit(arr,idx+1,part1,part2,s1+arr[idx],s2);
        part1.remove(part1.size()-1);
        part2.add(arr[idx]);
        printSplit(arr,idx+1,part1,part2,s1,s2+arr[idx]);
        part2.remove(part2.size()-1);
    }
    public static int countSplit(int[] arr,int idx,List<Integer>part1,List<Integer>part2,int s1,int s2)
    {
        if(idx==arr.length)
        {
            if(s1==s2)
            {
                return 1;
            }
            else{
                return 0;
            }
        }
        part1.add(arr[idx]);
        int count1=countSplit(arr,idx+1,part1,part2,s1+arr[idx],s2);
        part1.remove(part1.size()-1);
        part2.add(arr[idx]);
        int count2=countSplit(arr,idx+1,part1,part2,s1,s2+arr[idx]);
        part2.remove(part2.size()-1);

        return count1+count2;
    }
}
