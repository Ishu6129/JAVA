package Assignment_6;
import java.util.*;
public class generateBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            String s=sc.next();
            int n=count(s);
            print(n,s,"");
            t--;
        }

    }
    public static void print(int n,String s,String ans){
        if(n==0){
            int t=0;
            String str_ans="";
            for(int i=0;i<s.length();i++){
                str_ans+=(s.charAt(i)=='?' ? ans.charAt(t):s.charAt(i));
                t+=(s.charAt(i)=='?' ? 1:0);

            }
            System.out.print(str_ans+" ");
            return;
        }
        print(n-1,s,ans+"0");
        print(n-1,s,ans+"1");
    }
    public static int count(String str) {
        int left = 0;
        int right = str.length() - 1;
        int count = 0;
        while (left <= right) {
            if (str.charAt(left) == '?') {
                count++;
            }
            if (str.charAt(right) == '?' && left != right) {  // Avoid counting the same character when pointers meet
                count++;
            }
            left++;
            right--;
        }
        return count;
    }
}

//1
//1??0?101
//        
//10000101 10001101 10100101 10101101 11000101 11001101 11100101 11101101
