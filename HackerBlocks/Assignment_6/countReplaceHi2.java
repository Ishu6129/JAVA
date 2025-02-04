package Assignment_6;
import java.util.*;
public class countReplaceHi2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        abchihitfhi
        String ans = "";
        int i = 0;
        int count = 0;
        String new_ans = "";
        String replaced_ans = "";

        while (i < str.length()) {
            if (i+2==str.length() && str.charAt(i) == 'h' && str.charAt(i + 1) == 'i' || i + 2< str.length() && str.charAt(i) == 'h' && str.charAt(i + 1) == 'i' && str.charAt(i + 2) != 't') {
                count++;
                replaced_ans += "bye";
                i++;
            }
            else {
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

//abchihitfhi
//
//2
//abchitf
//abcbyehitfbye
