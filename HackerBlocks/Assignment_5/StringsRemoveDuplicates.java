package Assignment_5;
import java.util.*;
public class StringsRemoveDuplicates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int i=1;
        while(i<s.length()){
            if(!(s.charAt(i-1)==s.charAt(i))){
                System.out.print(s.charAt(i-1));
            }
            i++;
        }
        System.out.print(s.charAt(s.length()-1));
    }
}
