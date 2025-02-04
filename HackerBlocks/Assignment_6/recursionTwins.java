package Assignment_6;
import java.util.*;
public class recursionTwins {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(twinsCount(s));
    }
    public static int twinsCount(String s)
    {
        if(s.length()<3)
        {
            return 0;
        }
        int count=0;
        if(s.charAt(0)==s.charAt(2))
        {
            count=1;
        }
        else
        {
            count=0;
        }
        return count+twinsCount(s.substring(1));
    }
}

//AXAXA
//
//3