package Assignment_5;

import java.util.Scanner;

public class StringsCountPalindromicSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(substr(s));

    }
    public static int pallendrome(String s) {
        int i=0;
        int j=s.length()-1;
        int result=0;
        while(i<=j){
            if(!(s.charAt(i)==s.charAt(j))){
                result=0;
                break;
            }
            else{
                result=1;
            }
            i++;
            j--;
        }
        return result;
    }
    public static int substr(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                c+=pallendrome(s.substring(i,j));
            }
        }
        return c;
    }

}

