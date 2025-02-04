package Assignment_6;
import java.util.*;
public class stringToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int conv=0;
        for(int i=0;i<s.length();i++){
            conv=(conv*10)+((int)s.charAt(i)-48);
        }
        System.out.println(conv);
    }
}
