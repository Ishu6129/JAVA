package Assignment_6;

import java.util.*;

public class generateParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        generate(n,0,0,"");

    }
    public static void generate(int n,int open,int close,String ans){
        if(open==n && close==n){
            System.out.println(ans);
            return;
        }
        if(open>n || close>open){
            return;
        }
        generate(n,open,close+1,ans+")");
        generate(n,open+1,close,ans+"(");
    }
}

//2
//()()
//(())
