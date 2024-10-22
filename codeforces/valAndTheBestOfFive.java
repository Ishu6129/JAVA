package codeforces;
import java.util.*;
public class valAndTheBestOfFive{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n>0){
            c=0;
            String v=sc.next();
            for(int i=0;i<v.length();i++){
                if(v.charAt(i)=='A'){
                    c++;
                }
            }
            if(c>(v.length()-c)){
                System.out.println("A");
            }
            else{
                System.out.println("B");
            }
            n--;
        }
        sc.close();
    }
}
