package Assignment_6;
import java.util.*;
public class countRemoveReplace {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = "";
        int i = 0;
        int count = 0;
        String new_ans = "";
        String replaced_ans = "";

        while (i < str.length()) {
            if (i + 1 < str.length() && str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
                replaced_ans += "bye";
                i++;
            } else {
                new_ans += str.charAt(i);
                replaced_ans += str.charAt(i);
            }
            i++;
        }

        System.out.println(count);
        System.out.println(new_ans);
        System.out.println(replaced_ans);
    }
}

//abchibi
//
//1
//abcbi
//abcbyebi