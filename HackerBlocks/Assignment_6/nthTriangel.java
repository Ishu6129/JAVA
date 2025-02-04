package Assignment_6;
import java.util.*;
public class nthTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(print(n));
    }
    public static int print(int n){
        if(n<0){
            return 0;
        }
        return print(n-1)+n;
    }
}

//3

//6
//(1+2+3)