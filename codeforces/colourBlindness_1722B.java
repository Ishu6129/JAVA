package codeforces;

import java.util.Scanner;

public class colourBlindness{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int s_len=sc.nextInt();
            String a=sc.next();
            String b=sc.next();
            boolean flag=true;
            if(a.length()==b.length() && a.length()==s_len){
                for(int i=0;i<a.length();i++){
                    if(a.charAt(i)==b.charAt(i) || a.charAt(i)=='B' && b.charAt(i)=='G' || a.charAt(i)=='G' && b.charAt(i)=='B'){
                        continue;
                    }
                    else{
                        System.out.println("NO");
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    System.out.println("YES");

                }
            }
            else{
                System.out.println("NO");
            }
            n--;
        }
    }
}

