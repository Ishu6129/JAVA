package codeforces;
import java.util.*;
public class rook{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] s={"a","b","c","d","e","f","g","h"};
        while(n>0){
            String v=sc.next();
            String al=v.substring(0, 1);
            int intgr=Integer.parseInt(v.substring(1));
            for(int i=0;i<8;i++){
                if(!(s[i].equals(al))){
                    System.out.println(s[i]+intgr);
                }
                else{
                    System.out.print("");
                }
                if(!(intgr==(i+1))){
                    System.out.println(al+(i+1));
                }
                else{
                    System.out.print("");
                }
            }
            n--;
        }
        sc.close();
    }
}
