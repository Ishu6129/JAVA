package Assignment_5;
import java.util.*;
public class StringsIsPalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int i=0;
        int j=s.length()-1;
        boolean result=false;
        while(i<=j){
            if(!(s.charAt(i)==s.charAt(j))){
                result=false;
                break;
            }
            else{
                result=true;
            }
            i++;
            j--;
        }
        System.out.print(result);
    }
}
