package Assignment_6;
import java.util.*;
public class replaceAllPi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String str = sc.next();
            String ans = "";
            int i = 0;
            while (i < str.length()) {
                if (str.charAt(i) == 'p' && str.charAt(i + 1) == 'i') {
                    ans = ans + "3.14";
                    i++;
                } else {
                    ans = ans + str.charAt(i);
                }
                i++;
            }
            System.out.println(ans);
            t--;
        }
    }
}
//3
//xpix
//xabpixx3.15x
//xpipippixx

//x3.14x
//xab3.14xx3.15x
//x3.143.14p3.14xx