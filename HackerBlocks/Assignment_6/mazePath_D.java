package Assignment_6;
import java.util.*;
public class mazePath_D {
    static int count=0;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        print(0, 0, m - 1, n - 1, "");
        System.out.println("\n"+count);
    }

    public static void print(int cr, int cc, int er, int ec, String ans) {
        if (cr > er || cc > ec) {
            return;
        }
        if (cr == er && cc == ec) {
            System.out.print(ans+" ");
            count++;
            return;
        }
        print(cr + 1, cc, er, ec, ans + "V");
        print(cr, cc + 1, er, ec, ans + "H");
        print(cr+1,cc+1,er, ec, ans + "D");
    }
}

//3
//3
//
//VVHH VHVH VHHV VHD VDH HVVH HVHV HVD HHVV HDV DVH DHV DD
//13