package Assignment_5;
import java.util.*;
public class PlayingwithGoodString {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int max=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if( s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'
                    || s.charAt(i)=='o' || s.charAt(i)=='u'){
                c++;
            }
            else{
                if(max<c){
                    max=c;
                }
                c=0;
            }
        }
        if(max<c){
            max=c;
        }
        System.out.print(max);
    }
}
